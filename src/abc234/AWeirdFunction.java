package abc234;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc234/submissions/28386086
 */
public class AWeirdFunction {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int t = sc.nextInt();
      System.out.println(f(f((f(t) + t)) + f(f(t))));
    }
  }

  static int f(int t) {
    return (t * t) + (2 * t) + 3;
  }
}
