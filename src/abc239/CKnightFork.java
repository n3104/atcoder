package abc239;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc239/tasks/abc239_c
 * 
 * 解説で言うとこちらと同じやり方。
 * https://atcoder.jp/contests/abc239/editorial/3403
 */
public class CKnightFork {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      int x1 = sc.nextInt();
      int y1 = sc.nextInt();
      int x2 = sc.nextInt();
      int y2 = sc.nextInt();
      int[][] distances = {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};
      for (int i = 0; i < distances.length; i++) {
        int[] d1 = distances[i];
        int point1x = x1 + d1[0];
        int point1y = y1 + d1[1];
        for (int j = 0; j < distances.length; j++) {
          int[] d2 = distances[j];
          int point2x = x2 + d2[0];
          int point2y = y2 + d2[1];
          if (point1x == point2x && point1y == point2y) {
            System.out.println("Yes");
            return;
          }
        }
      }
      System.out.println("No");
    }
  }
}
