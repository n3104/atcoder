package abc192;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc192/tasks/abc192_b
 */
public class BuNrEaDaBlEsTrInG {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      char[] S = sc.next().toCharArray();
      boolean result = true;
      for (int i = 0; i < S.length; i++) {
        char c = S[i];
        if (i % 2 == 0 && Character.isLowerCase(c)) {
          continue;
        }
        if (i % 2 == 1 && Character.isUpperCase(c)) {
          continue;
        }
        result = false;
        break;
      }
      if (result) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
