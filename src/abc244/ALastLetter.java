package abc244;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc244/tasks/abc244_a
 */
public class ALastLetter {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      String S = sc.next();
      System.out.println(S.charAt(N - 1));
    }
  }
}
