package abc207;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc207/tasks/abc207_b
 */
public class BHydrate {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      if (B >= C * D) {
        System.out.println(-1);
        return;
      }
      for (long i = 1; true; i++) {
        if (A + i * B <= i * C * D) {
          System.out.println(i);
          return;
        }
      }
    }
  }
}
