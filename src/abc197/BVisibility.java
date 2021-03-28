package abc197;
import java.util.Scanner;

public class BVisibility {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int H = sc.nextInt();
      int W = sc.nextInt();
      int X = sc.nextInt() - 1;
      int Y = sc.nextInt() - 1;
      char[][] grid = new char[H][W];
      for (int i = 0; i < H; i++) {
        grid[i] = sc.next().toCharArray();
      }
      int result = 0;
      // マス目 (X, Y)
      if (grid[X][Y] == '.') {
        result++;
      }
      // マス目の左側
      for (int i = Y - 1; i >= 0; i--) {
        if (grid[X][i] == '.') {
          result++;
        } else {
          break;
        }
      }
      // マス目の右側
      for (int i = Y + 1; i < W; i++) {
        if (grid[X][i] == '.') {
          result++;
        } else {
          break;
        }
      }
      // マス目の上側
      for (int i = X - 1; i >= 0; i--) {
        if (grid[i][Y] == '.') {
          result++;
        } else {
          break;
        }
      }
      // マス目の下側
      for (int i = X + 1; i < H; i++) {
        if (grid[i][Y] == '.') {
          result++;
        } else {
          break;
        }
      }
      System.out.println(result);
    }
  }
}
