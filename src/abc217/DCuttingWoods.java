package abc217;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * https://atcoder.jp/contests/abc217/tasks/abc217_d
 * 
 * 解説を見て実装した。TreeSet を使えば簡単に実装できた。
 * https://atcoder.jp/contests/abc217/editorial/2578
 */
public class DCuttingWoods {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int L = sc.nextInt();
      int Q = sc.nextInt();
      TreeSet<Integer> cutPoints = new TreeSet<>();
      cutPoints.add(0);
      cutPoints.add(L);
      for (int i = 0; i < Q; i++) {
        int c = sc.nextInt();
        int x = sc.nextInt();
        if (c == 1) {
          cutPoints.add(x);
        } else {
          Integer floor = cutPoints.floor(x);
          Integer higher = cutPoints.higher(x);
          System.out.println(higher - floor);
        }
      }
    }
  }
}

