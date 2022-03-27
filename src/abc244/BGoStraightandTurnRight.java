package abc244;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc244/tasks/abc244_b
 */
public class BGoStraightandTurnRight {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      String T = sc.next();
      int x = 0;
      int y = 0;
      final int east = 0;
      final int south = 1;
      final int west = 2;
      final int north = 3;
      int direction = 0;
      for (int i = 0; i < N; i++) {
        char c = T.charAt(i);
        if (c == 'S') {
          switch (direction) {
            case east:
              x++;
              break;
            case south:
              y--;
              break;
            case west:
              x--;
              break;
            case north:
              y++;
              break;

            default:
              break;
          }
        } else {
          direction++;
          if (direction == 4) {
            direction = 0;
          }
        }
      }
      System.out.println(x + " " + y);
    }
  }
}
