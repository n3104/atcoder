package abc215;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc215/tasks/abc215_b
 */
public class Blog2N {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      long N = sc.nextLong();
      long x = 2;
      for (int k = 1; true; k++) {
        if (x > N) {
          System.out.println(k - 1);
          return;
        }
        x *= 2;
      }
    }
  }
}
