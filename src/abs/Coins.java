package abs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * https://atcoder.jp/contests/abs/tasks/abc087_b
 * 
 * 30分ぐらいで解けた。
 * 
 * それぞれのコインの組み合わせを再帰的に試すだけでいい。ただし、同じ組み合わせは初回のみ試すようにする。
 */
public class Coins {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int x = sc.nextInt();
      set = new HashSet<>(a * b * c);
      System.out.println(count(a, b, c, x));
    }
  }

  static Set<String> set;

  static int count(int a, int b, int c, int x) {
    // 同じ組み合わせは重複して計上することになるので処理しない。
    String combination = a + ":" + b + ":" + c + ":" + x;
    if (set.contains(combination)) {
      return 0;
    } else {
      set.add(combination);
    }
    if (x > 0) {
      int result = 0;
      if (a > 0) {
        result = count(a - 1, b, c, x - 500);
      }
      if (b > 0) {
        result += count(a, b - 1, c, x - 100);
      }
      if (c > 0) {
        result += count(a, b, c - 1, x - 50);
      }
      return result;
    } else if (x == 0) {
      return 1;
    } else {
      return 0;
    }
  }
}
