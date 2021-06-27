package abc207;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc207/tasks/abc207_c
 */
public class CManySegments {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      double[][] intervals = new double[N][2];
      for (int i = 0; i < N; i++) {
        int t = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        double[] interval = new double[2];
        switch (t) {
          case 1:
            interval[0] = l;
            interval[1] = r;
            break;

          case 2:
            interval[0] = l;
            interval[1] = r - 0.1;
            break;

          case 3:
            interval[0] = l + 0.1;
            interval[1] = r;
            break;

          case 4:
            interval[0] = l + 0.1;
            interval[1] = r - 0.1;
            break;

        }
        intervals[i] = interval;
      }
      int count = 0;
      for (int i = 0; i < intervals.length; i++) {
        double[] ii = intervals[i];
        for (int j = i + 1; j < intervals.length; j++) {
          double[] ij = intervals[j];
          if ((ij[0] <= ii[0] && ii[0] <= ij[1]) || (ij[0] <= ii[1] && ii[1] <= ij[1])
              || (ii[0] <= ij[0] && ij[0] <= ii[1]) || (ii[0] <= ij[1] && ij[1] <= ii[1])) {
            count++;
          }
        }
      }
      System.out.println(count);
    }
  }
}
