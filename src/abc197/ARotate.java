package abc197;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc197/tasks/abc197_a
 */
public class ARotate {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String S = sc.next();
      System.out.println(S.substring(1) + S.substring(0, 1));
    }
  }
}
