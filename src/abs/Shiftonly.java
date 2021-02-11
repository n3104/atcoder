package abs;

import java.util.Scanner;

//
/*
 * https://atcoder.jp/contests/abs/tasks/abc081_b
 * 
 * 30分ぐらいで解けた。
 * 
 * 可読性の観点で、まずは全ての整数を2で割れるかどうか確認し、割れる場合は全て2で割るという実装にした。
 */
public class Shiftonly {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }
      for (int i = 0; true; i++) {
        if (canDivide(a) == false) {
          System.out.println(i);
          break;
        }
        a = divide(a);
      }
    }
  }

  static boolean canDivide(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 1) {
        return false;
      }
    }
    return true;
  }

  static int[] divide(int[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] / 2;
    }
    return a;
  }
}
