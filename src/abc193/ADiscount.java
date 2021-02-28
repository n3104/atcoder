package abc193;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc193/tasks/abc193_a
 */
public class ADiscount {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      System.out.println((A - B) * 100.0 / A);
    }
  }
}
