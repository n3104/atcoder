package abc239;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc239/tasks/abc239_b
 */
public class BIntegerDivision {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      long X = sc.nextLong();
      if (X > 0) {
        System.out.println(X / 10);
      } else {
        System.out.println((X - 9) / 10);
      }
    }
  }
}
