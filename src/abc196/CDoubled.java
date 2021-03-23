package abc196;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc196/tasks/abc196_c
 * 
 * 数字を実際にいくつか書いてみて規則性を見つけて実装した。
 * ただ、解説に乗っているやり方のほうが明らかにスマート。気づけなかったorz
 * https://atcoder.jp/contests/abc196/editorial/946
 */
public class CDoubled {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      long N = sc.nextLong();
      int count = 0;
      for (int x = 11; x < 100; x += 11) {
        if (N < x) {
          break;
        }
        count++;
      }
      for (int x = 1010; x < 10000; x += 101) {
        if (N < x) {
          break;
        }
        count++;
      }
      for (int x = 100100; x < 1000000; x += 1001) {
        if (N < x) {
          break;
        }
        count++;
      }
      for (int x = 10001000; x < 100000000; x += 10001) {
        if (N < x) {
          break;
        }
        count++;
      }
      for (long x = 1000010000; x < 10000000000L; x += 100001) {
        if (N < x) {
          break;
        }
        count++;
      }
      for (long x = 100000100000L; x < 1000000000000L; x += 1000001) {
        if (N < x) {
          break;
        }
        count++;
      }
      System.out.println(count);
    }
  }
}
