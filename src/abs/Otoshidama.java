package abs;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abs/tasks/abc085_c
 * 
 * 1時間ぐらいで解けた。
 * 
 * 入力されたN枚のお札を使い切る組み合わせなのでまずは1万円の枚数を決めて、残りの枚数を5千円と千円で分け合うので二重ループで組み合わせを確認できる。
 */
public class Otoshidama {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int Y = sc.nextInt();
      Searcher s = new Searcher();
      boolean existsMatchedCombination = s.execute(N, Y);
      if (existsMatchedCombination) {
        System.out.println(String.format("%d %d %d", s.x, s.y, s.z));
      } else {
        System.out.println("-1 -1 -1");
      }
    }
  }

  public static class Searcher {
    int x;
    int y;
    int z;

    boolean execute(int N, int Y) {
      x = 0;
      y = 0;
      z = 0;
      for (int i = N; i >= 0; i--) {
        x = i;
        for (int j = N - i; j >= 0; j--) {
          y = j;
          z = (N - i) - j;
          if (match(x, y, z, Y)) {
            return true;
          }
        }
      }
      return false;
    }

    static boolean match(int x, int y, int z, int Y) {
      boolean result = (Y == (x * 10000 + y * 5000 + z * 1000));
      // System.out.println(String.format("%d %d %d %b", x, y, z, result));
      return result;
    }
  }
}
