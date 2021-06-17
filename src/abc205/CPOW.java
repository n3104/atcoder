package abc205;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc205/tasks/abc205_c
 */
public class CPOW {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      if (C % 2 == 0) {
        A = Math.abs(A);
        B = Math.abs(B);
      }
      if (A < B) {
        System.out.println("<");
      } else if (A > B) {
        System.out.println(">");
      } else {
        System.out.println("=");
      }
    }
  }
}
