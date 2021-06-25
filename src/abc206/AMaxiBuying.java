package abc206;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc206/tasks/abc206_a
 */
public class AMaxiBuying {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int x = (int) (N * 1.08);
      if (x < 206) {
        System.out.println("Yay!");
      } else if (x == 206) {
        System.out.println("so-so");
      } else {
        System.out.println(":(");
      }
    }
  }
}
