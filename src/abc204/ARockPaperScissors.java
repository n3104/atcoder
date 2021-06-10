package abc204;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/ABC204/tasks/abc204_a
 */
public class ARockPaperScissors {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      if (x == y) {
        System.out.println(x);
      } else {
        System.out.println(3 - (x + y));
      }
    }
  }
}
