package abc209;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc209/tasks/abc209_a
 */
public class ACounting {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      if (A > B) {
        System.out.println(0);
        return;
      }
      System.out.println(B - A + 1);
    }
  }
}
