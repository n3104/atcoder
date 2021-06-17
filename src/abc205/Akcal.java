package abc205;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc205/tasks/abc205_a
 */
public class Akcal {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      System.out.println(A * (B / 100.0));
    }
  }
}
