package abs;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abs/tasks/abc081_a
 * 
 * 5分ぐらいで解けた。
 */
public class PlacingMarbles {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      char[] s = sc.next().toCharArray();
      int result = 0;
      for (int i = 0; i < s.length; i++) {
        if (s[i] == '1') {
          result++;
        }
      }
      System.out.println(result);
    }
  }
}
