package dp;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/dp/tasks/dp_b
 */
public class BFrog2 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      int[] h = new int[N];
      for (int i = 0; i < N; i++) {
        h[i] = sc.nextInt();
      }
      int[] c = new int[N];
      for (int i = 0; i < N; i++) {
        if (i == 0) {
          c[i] = 0;
        } else {
          int range = Math.min(K, i);
          c[i] = Integer.MAX_VALUE;
          for (int j = 1; j <= range; j++) {
            c[i] = Math.min(c[i], Math.abs(h[i - j] - h[i]) + c[i - j]);
          }
        }
      }
      System.out.println(c[N - 1]);
    }
  }
}
