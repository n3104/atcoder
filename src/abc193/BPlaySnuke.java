package abc193;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc193/tasks/abc193_b
 */
public class BPlaySnuke {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int result = 1000000000;
      for (int i = 0; i < N; i++) {
        int A = sc.nextInt();
        int P = sc.nextInt();
        int X = sc.nextInt();
        if ((X - A) > 0 && P < result) {
          result = P;
        }
      }
      if (result == 1000000000) {
        result = -1;
      }
      System.out.println(result);
    }
  }
}
