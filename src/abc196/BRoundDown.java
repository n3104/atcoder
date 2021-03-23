package abc196;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc196/tasks/abc196_b
 */
public class BRoundDown {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String X = sc.next();
      if (X.contains(".")) {
        System.out.println(X.split("\\.")[0]);
      } else {
        System.out.println(X);
      }
    }
  }
}
