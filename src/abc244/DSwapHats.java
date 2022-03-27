package abc244;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc244/tasks/abc244_d
 */
public class DSwapHats {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      String[] S = new String[3];
      String[] T = new String[3];
      for (int i = 0; i < 3; i++) {
        S[i] = sc.next();
      }
      for (int i = 0; i < 3; i++) {
        T[i] = sc.next();
      }
      int matched = 0;
      for (int i = 0; i < 3; i++) {
        if (S[i].equals(T[i])) {
          matched++;
        }
      }
      if (matched == 3 || matched == 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
