package abc234;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc234/submissions/28395761
 */
public class BLongestSegment {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int[][] points = new int[N][2];
      for (int i = 0; i < points.length; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        points[i] = new int[] {x, y};
      }
      double result = 0;
      for (int i = 0; i < points.length; i++) {
        int[] pointA = points[i];
        for (int j = i + 1; j < points.length; j++) {
          int[] pointB = points[j];
          double distance = distance(pointA[0], pointA[1], pointB[0], pointB[1]);
          result = Math.max(result, distance);
        }
      }
      System.out.println(result);
    }
  }

  static double distance(double x, double y, double x2, double y2) {
    return Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
  }
}
