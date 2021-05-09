package abc200;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc200/tasks/abc200_a
 */
public class ACentury {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      System.out.println((int) Math.ceil(N / 100.0));
    }
  }
}
