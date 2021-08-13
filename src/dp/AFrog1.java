package dp;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/dp/tasks/dp_a
 * 
 * 以下を参考にして実装した。
 * https://qiita.com/drken/items/dc53c683d6de8aeacf5a
 */
public class AFrog1 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int[] h = new int[N];
      for (int i = 0; i < N; i++) {
        h[i] = sc.nextInt();
      }
      int[] c = new int[N];
      for (int i = 0; i < N; i++) {
        if (i == 0) {
          c[i] = 0;
        } else if (i == 1) {
          c[i] = Math.abs(h[0] - h[i]);
        } else {
          c[i] =
              Math.min(Math.abs(h[i - 2] - h[i]) + c[i - 2], Math.abs(h[i - 1] - h[i]) + c[i - 1]);
        }
      }
      System.out.println(c[N - 1]);
    }
  }
}
