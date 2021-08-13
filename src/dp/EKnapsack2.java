package dp;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/dp/tasks/dp_e
 * 
 * 以下を実装して理解した。
 * https://qiita.com/drken/items/dc53c683d6de8aeacf5a#e-%E5%95%8F%E9%A1%8C---knapsack-2
 */
public class EKnapsack2 {


  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int W = sc.nextInt();
      int[] weight = new int[N];
      int[] value = new int[N];
      int maxV = 1; // W と maxV が一致するケースがあるのでマージンが必要
      for (int i = 0; i < N; i++) {
        weight[i] = sc.nextInt();
        value[i] = sc.nextInt();
        maxV += value[i];
      }
      long[][] dp = new long[N + 1][maxV]; // 0 個のケースからスタートするのでマージンが必要
      for (int i = 0; i < N + 1; i++) {
        for (int j = 0; j < maxV; j++) {
          dp[i][j] = 1000000000L * 100; // 単純に Long.MAX_VALUE だとオーバーフローする
        }
      }
      // 初期値。これを指定しないと1つ目の品物で最小値に対して重さを加算することになってしまう。
      dp[0][0] = 0;
      for (int i = 0; i < N; i++) {
        for (int sumV = 0; sumV < maxV; sumV++) {
          // i 番目の品物を選ぶ場合
          if (sumV - value[i] >= 0) {
            dp[i + 1][sumV] = Math.min(dp[i + 1][sumV], dp[i][sumV - value[i]] + weight[i]);
          }
          // i 番目の品物を選ばない場合
          dp[i + 1][sumV] = Math.min(dp[i + 1][sumV], dp[i][sumV]);
        }
      }
      int res = 0;
      for (int sumV = 0; sumV < maxV; sumV++) {
        if (dp[N][sumV] <= W) {
          res = sumV;
        }
      }
      System.out.println(res);
    }
  }
}
