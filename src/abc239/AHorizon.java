package abc239;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc239/tasks/abc239_a
 */
public class AHorizon {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      long H = sc.nextLong();
      System.out.println(Math.sqrt(H * (12800000 + H)));
    }
  }
}
