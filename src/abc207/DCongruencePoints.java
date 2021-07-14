package abc207;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc207/tasks/abc207_d
 * 
 * 解説を参考に実装した。
 * https://atcoder.jp/contests/abc207/editorial/2153
 */
public class DCongruencePoints {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int[] a = new int[N];
      int[] b = new int[N];
      int[] c = new int[N];
      int[] d = new int[N];
      readInputAppliedCenterOfMass(sc, N, a, b);
      readInputAppliedCenterOfMass(sc, N, c, d);
      int ax = a[0];
      int by = b[0];
      // (a1, b1) が重心、つまり (0, 0) と同じ場合は問題になるらしい
      if (N >= 2 && a[0] == 0 && b[0] == 0) {
        ax = a[1];
        by = b[1];
      }
      for (int i = 0; i < N; i++) {
        double angle = Math.atan2(d[i], c[i]) - Math.atan2(by, ax);
        boolean flag1 = true;
        for (int j = 0; j < N; j++) {
          long x = Math.round(a[j] * Math.cos(angle) - b[j] * Math.sin(angle));
          long y = Math.round(a[j] * Math.sin(angle) + b[j] * Math.cos(angle));
          boolean flag2 = false;
          for (int k = 0; k < N; k++) {
            if (c[k] == x && d[k] == y) {
              flag2 = true;
            }
          }
          flag1 &= flag2;
        }
        if (flag1 == true) {
          System.out.println("Yes");
          return;
        }
      }
      System.out.println("No");
    }
  }

  /*
   * 入力に対して重心を引いておく。こうすることでSとTの比較は回転のみで可能になる。
   * また、整数で処理できるように重心を引く際にNで割るのではなく、個々の点にNを掛ける。
   * （SとTの比較であれば療法をN倍にしても問題ないため）
   */
  private static void readInputAppliedCenterOfMass(Scanner sc, int N, int[] a, int[] b) {
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    int x = 0;
    int y = 0;
    for (int i = 0; i < N; i++) {
      x += a[i];
      y += b[i];
      // 整数値にするため個々の点にNを掛けておく
      a[i] *= N;
      b[i] *= N;
    }
    for (int i = 0; i < N; i++) {
      // 個々の点にNを掛けてあるので重心を引く際はNで割らずに単に合計した値を引く
      a[i] -= x;
      b[i] -= y;
    }
  }
}
