package abc196;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc196/tasks/abc196_a
 */
public class ADifferenceMax {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      sc.nextInt(); // a
      int b = sc.nextInt();
      int c = sc.nextInt();
      sc.nextInt(); // d
      System.out.println(b - c);
    }
  }
}
