package abc238;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc238/tasks/abc238_c
 * 
 * 解説をそのまま実装した。
 * https://atcoder.jp/contests/abc238/editorial/3350
 */
public class Cdigitnum {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      long N = sc.nextLong();
      long res = 0;
      long p10 = 10;
      for (int i = 1; i <= 18; i++) {
        long l = p10 / 10;
        long r = Math.min(N, p10 - 1);
        if (l <= r) {
          res += triangularNumber(r - l + 1);
          res %= mod;
        }
        p10 *= 10;
      }
      System.out.println(res);
    }
  }

  static final long mod = 998244353;
  static final long inv2 = 499122177;

  private static long triangularNumber(long x) {
    x %= mod;
    long res = x;
    res *= (x + 1);
    res %= mod;
    res *= inv2;
    res %= mod;
    return res;
  }
}
