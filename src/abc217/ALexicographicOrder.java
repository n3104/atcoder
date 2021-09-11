package abc217;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc217/tasks/abc217_a
 */
public class ALexicographicOrder {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String S = sc.next();
      String T = sc.next();
      if (S.compareTo(T) < 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}

