package abs;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abs/tasks/abc088_b
 * 
 * 20分ぐらい解けた。
 * 
 * 単にソートして交互に点数を割り当てて最後に差を取ればいい。
 */
public class CardGameforTwo {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }
      Arrays.sort(a);
      int scoreOfAlice = 0;
      int scoreOfBob = 0;
      boolean isTurnOfAlice = true;
      for (int i = a.length - 1; i >= 0; i--) {
        if (isTurnOfAlice) {
          scoreOfAlice += a[i];
          isTurnOfAlice = false;
        } else {
          scoreOfBob += a[i];
          isTurnOfAlice = true;
        }
      }
      System.out.println(scoreOfAlice - scoreOfBob);
    }
  }
}
