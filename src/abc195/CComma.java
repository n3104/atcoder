package abc195;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc195/tasks/abc195_c
 * 
 * 解けなかった。解説を読んで理解したorz
 * https://atcoder.jp/contests/abc195/editorial/837
 */
public class CComma {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      long N = sc.nextLong();
      long result = 0;
      if (N >= 1_000) {
        result += N - 999;
      }
      if (N >= 1_000_000) {
        result += N - 999_999;
      }
      if (N >= 1_000_000_000) {
        result += N - 999_999_999;
      }
      if (N >= 1_000_000_000_000L) {
        result += N - 999_999_999_999L;
      }
      if (N >= 1_000_000_000_000_000L) {
        result += N - 999_999_999_999_999L;
      }
      System.out.println(result);
    }
  }
}
