package ahc001;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/ahc001/tasks/ahc001_a
 * 暫定テスト: 44,076,995,785
 * 
 * 得点は広告のスペースに関係ないので、小さな項目から順番に希望する広告スペースまで広げてみた。
 */
public class CExpandFromSmallAds {

  // [y][x]
  static boolean[][] map = new boolean[10000][10000];

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      List<Ad> ads = new ArrayList<>(n);
      for (int i = 0; i < n; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        ads.add(new Ad(i + 1, x, y, r));
      }
      // expand in order from the smallest advertisement
      ads.sort(Comparator.comparingInt(Ad::getR));
      for (Ad ad : ads) {
        ad.expand();
      }
      // print result
      ads.sort(Comparator.comparingInt(Ad::getId));
      for (Ad ad : ads) {
        // System.out.println(ad.a + " " + ad.b + " " + ad.c + " " + ad.d + " " + ad.getArea());
        System.out.println(ad.a + " " + ad.b + " " + ad.c + " " + ad.d);
      }
    }
  }

  static class Ad {
    final int id;
    final int x;
    final int y;
    final int r;
    int a;
    int b;
    int c;
    int d;

    Ad(int id, int x, int y, int r) {
      this.id = id;
      this.x = x;
      this.y = y;
      this.r = r;
      this.a = x;
      this.b = y;
      this.c = x + 1;
      this.d = y + 1;
      fill(a, b, c, d);
    }

    int getId() {
      return this.id;
    }

    int getR() {
      return this.r;
    }

    void expand() {
      boolean canExpandRight = true;
      boolean canExpandBottom = true;
      boolean canExpandLeft = true;
      boolean canExpandTop = true;
      while (true) {
        // expand right
        if (canExpandRight && canFill(this.c, this.b, this.c + 1, this.d)) {
          fill(this.c, this.b, this.c + 1, this.d);
          this.c++;
        } else {
          canExpandRight = false;
        }
        // expand bottom
        if (canExpandBottom && canFill(this.a, this.d, this.c, this.d + 1)) {
          fill(this.a, this.d, this.c, this.d + 1);
          this.d++;
        } else {
          canExpandBottom = false;
        }
        // expand left
        if (canExpandLeft && canFill(this.a - 1, this.b, this.a, this.d)) {
          fill(this.a - 1, this.b, this.a, this.d);
          this.a--;
        } else {
          canExpandLeft = false;
        }
        // expand top
        if (canExpandTop && canFill(this.a, this.b - 1, this.c, this.b)) {
          fill(this.a, this.b - 1, this.c, this.b);
          this.b--;
        } else {
          canExpandTop = false;
        }
        if (canExpandRight == false && canExpandBottom == false && canExpandLeft == false
            && canExpandTop == false) {
          break;
        }
        if (getArea() >= this.r) {
          break;
        }
      }
    }

    int getArea() {
      return (this.c - this.a) * (this.d - this.b);
    }

    void fill(int a, int b, int c, int d) {
      for (int x = a; x < c; x++) {
        for (int y = b; y < d; y++) {
          map[y][x] = true;
        }
      }
    }

    boolean canFill(int a, int b, int c, int d) {
      if (a < 0 || b < 0 || c > 10000 || d > 10000) {
        return false;
      }
      for (int x = a; x < c; x++) {
        for (int y = b; y < d; y++) {
          if (map[y][x]) {
            return false;
          }
        }
      }
      return true;
    }
  }
}
