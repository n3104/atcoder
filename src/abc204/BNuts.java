package abc204;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/ABC204/tasks/abc204_b
 */
public class BNuts {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int total = 0;
      for (int i = 0; i < N; i++) {
        int a = sc.nextInt();
        if (a > 10) {
          total += a - 10;
        }
      }
      System.out.println(total);
    }
  }
}
