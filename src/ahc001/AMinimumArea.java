package ahc001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/ahc001/tasks/ahc001_a
 * 暫定テスト: 823,090
 * 
 * とりあえず希望する位置だけ塗ったもの。
 * 
 */
public class AMinimumArea {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      List<Ad> ads = new ArrayList<>(n);
      for (int i = 0; i < n; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        ads.add(new Ad(x, y, r));
      }
      for (Ad ad : ads) {
        System.out.println(ad.a + " " + ad.b + " " + ad.c + " " + ad.d);
      }
    }
  }

  static class Ad {
    final int x;
    final int y;
    final int r;
    int a;
    int b;
    int c;
    int d;

    Ad(int x, int y, int r) {
      this.x = x;
      this.y = y;
      this.r = r;
      this.a = x;
      this.b = y;
      this.c = x + 1;
      this.d = y + 1;
    }
  }
}
