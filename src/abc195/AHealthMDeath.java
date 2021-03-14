package abc195;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc195/tasks/abc195_a
 */
public class AHealthMDeath {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int M = sc.nextInt();
      int H = sc.nextInt();
      if (H % M == 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
