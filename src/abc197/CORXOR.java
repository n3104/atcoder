package abc197;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc197/tasks/abc197_c
 * 
 * 解けなかった。解説を読んで理解した。
 * https://atcoder.jp/contests/abc197/editorial/997
 */
public class CORXOR {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < N; i++) {
        A[i] = sc.nextInt();
      }
      int result = Integer.MAX_VALUE;
      for (int i = 0; i < (1 << (N - 1)); i++) {
        int xored = 0;
        int ored = 0;
        for (int j = 0; j <= N; j++) {
          if (j < N) {
            ored |= A[j];
          }
          // 最後の区間もしくは区間の切れ目
          // ((i >> j & 1) > 0) は i の各ビットが 1 であれば切れ目を意味する
          if (j == N || ((i >> j & 1) == 1)) {
            xored ^= ored;
            ored = 0;
          }
        }
        result = Integer.min(result, xored);
      }
      System.out.println(result);
    }
  }
}
