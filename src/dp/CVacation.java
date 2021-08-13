package dp;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/dp/tasks/dp_c
 * 
 * 解けなくて、以下をそのまま実装した。
 * https://qiita.com/drken/items/dc53c683d6de8aeacf5a#c-%E5%95%8F%E9%A1%8C---vacation
 */
public class CVacation {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int[][] a = new int[N][3];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < 3; j++) {
          a[i][j] = sc.nextInt();
        }
      }
      // 初日を考慮して i - 1 日目までの幸福度の最大値を dp[i] に格納する。
      // つまり dp[i + 1] は i 日目の幸福度を表す。dp のみインデックスが 1 つずれるので注意する。
      int[][] dp = new int[N + 1][3];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < 3; j++) {
          for (int k = 0; k < 3; k++) {
            if (j == k) {
              continue;
            }
            dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + a[i][k]);
          }
        }
      }
      int result = 0;
      for (int i = 0; i < 3; i++) {
        result = Math.max(result, dp[N][i]);
      }
      System.out.println(result);
    }
  }
}
