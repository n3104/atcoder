package abc196;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc196/tasks/abc196_d
 * 
 * 解けなくて解説を読んでそのまま実装して理解した。
 * https://atcoder.jp/contests/abc196/editorial/930
 */
public class DHanjo {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      H = sc.nextInt();
      W = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      dfs(0, 0, A, B);
      System.out.println(ans);
    }
  }

  static int H;
  static int W;
  static int ans = 0;

  /*
   * i: インデックスでもあり、配置する位置も表す。
   * bit: 配置済みの位置を表す。x軸方向から行ごとに割り当てる。
   * 
   */
  static void dfs(int i, int bit, int A, int B) {
    if (i == H * W) {
      ans++;
      return;
    }
    // 既に配置されている場合はそのインデックス（位置）をスキップする。
    if (((bit >> i) & 1) == 1) {
      dfs(i + 1, bit, A, B);
      return;
    }
    // インデックスの位置にタイルを配置する。
    if (B > 0) {
      dfs(i + 1, bit | (1 << i), A, B - 1);
    }
    if (A > 0) {
      // 横方向に配置する
      // 左側の条件が右端でないことの確認で、右側は右隣が既に埋まっていないことの確認
      if (i % W != W - 1 && !((bit & (1 << (i + 1))) > 0)) {
        dfs(i + 1, bit | 1 << i | 1 << (i + 1), A - 1, B);
      }
      // 下方向に配置する
      // 条件式は下の行が存在することの確認
      if (i + W < H * W) {
        dfs(i + 1, bit | 1 << i | 1 << (i + W), A - 1, B);
      }
    }
  }
}
