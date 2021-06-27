package abc207;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc207/tasks/abc207_a
 */
public class ARepression {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      System.out.println(Math.max(Math.max(A + B, B + C), C + A));
    }
  }
}
