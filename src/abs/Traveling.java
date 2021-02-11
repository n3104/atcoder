package abs;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abs/tasks/arc089_a
 * 
 * 1時間ぐらいで解けた。
 * 
 * 移動がx軸もしくはy軸で1つずつで、同じ点を何度も通過可能なため、単純に前回のポイントからのマンハッタン距離と移動時間で算出可能と判断して実装した。
 */
public class Traveling {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int fromX = 0;
      int fromY = 0;
      int previousT = 0;
      boolean result = true;
      for (int i = 0; i < N; i++) {
        int t = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (canStayPlace(fromX, fromY, x, y, t - previousT)) {
          fromX = x;
          fromY = y;
          previousT = t;
        } else {
          result = false;
          break;
        }
      }
      if (result) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }

  static boolean canStayPlace(int fromX, int fromY, int toX, int toY, int timesDiff) {
    int distance = Math.abs(toX - fromX) + Math.abs(toY - fromY);
    // System.out.println(String.format("from: (%d, %d), to: (%d, %d), timesDiff:%d, distance:%d",
    // fromX, fromY, toX, toY, timesDiff, distance));

    // そもそも移動時間が距離よりも小さい場合はポイントまで移動できない。
    if (timesDiff < distance) {
      return false;
    }
    // 距離の残りが奇数の場合はポイントにちょうど止まれない。
    if ((timesDiff - distance) % 2 == 1) {
      return false;
    }
    return true;
  }

}
