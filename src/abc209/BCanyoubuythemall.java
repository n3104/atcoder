package abc209;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc209/tasks/abc209_b
 */
public class BCanyoubuythemall {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int X = sc.nextInt();
      int sumOfA = 0;
      for (int i = 1; i <= N; i++) {
        int A = sc.nextInt();
        if (i % 2 == 0) {
          A--;
        }
        sumOfA += A;
      }
      if (X >= sumOfA) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
