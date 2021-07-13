package abc209;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc209/tasks/abc209_c
 * 
 * 組み合わせを数えればいいのでソートしてよいことに気づかなかった。
 * https://atcoder.jp/contests/abc209/editorial/2228
 */
public class CNotEqual {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int[] Cs = new int[N];
      for (int i = 0; i < N; i++) {
        Cs[i] = sc.nextInt();
      }
      Arrays.sort(Cs);

      long count = 1;
      for (int i = 0; i < N; i++) {
        int C = Cs[i];
        count = (count * (C - i)) % 1000000007;
      }
      System.out.println(count);
    }
  }
}
