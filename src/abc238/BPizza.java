package abc238;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc238/tasks/abc238_b
 */
public class BPizza {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      boolean[] cuts = new boolean[360];
      int N = sc.nextInt();
      int position = 0;
      cuts[0] = true;
      for (int i = 0; i < N; i++) {
        int A = sc.nextInt();
        position = (A + position) % 360;
        cuts[position] = true;
      }
      int max = 0;
      int count = 1;
      for (int i = 1; i <= cuts.length; i++) {
        if (cuts[i % 360] == true) {
          max = Math.max(max, count);
          count = 1;
          continue;
        }
        count++;
      }
      System.out.println(max);
    }
  }
}
