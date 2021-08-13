package dp;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/dp/tasks/dp_d
 * 
 * 以下を実装して理解した。
 * https://qiita.com/drken/items/dc53c683d6de8aeacf5a#d-%E5%95%8F%E9%A1%8C---knapsack-1
 */
public class DKnapsack1 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int W = sc.nextInt();
      int[] weight = new int[N];
      int[] value = new int[N];
      for (int i = 0; i < N; i++) {
        weight[i] = sc.nextInt();
        value[i] = sc.nextInt();
      }
      long[][] dp = new long[N + 1][W + 1];
      for (int i = 0; i < N; i++) {
        for (int sumW = 0; sumW <= W; sumW++) {
          // i 番目の品物を選ぶ場合
          if (sumW - weight[i] >= 0) {
            dp[i + 1][sumW] = Math.max(dp[i + 1][sumW], dp[i][sumW - weight[i]] + value[i]);
          }
          // i 番目の品物を選ばない場合
          dp[i + 1][sumW] = Math.max(dp[i + 1][sumW], dp[i][sumW]);
        }
      }
      System.out.println(dp[N][W]);
    }
  }
}
