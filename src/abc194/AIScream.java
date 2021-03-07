package abc194;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc194/tasks/abc194_a
 */
public class AIScream {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      if (A + B >= 15 && B >= 8) {
        System.out.println(1);
      } else if (A + B >= 10 && B >= 3) {
        System.out.println(2);
      } else if (A + B >= 3) {
        System.out.println(3);
      } else {
        System.out.println(4);
      }
    }
  }
}
