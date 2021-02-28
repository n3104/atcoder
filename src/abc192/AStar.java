package abc192;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc192/tasks/abc192_a
 */
public class AStar {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      long X = sc.nextInt();
      long reminder = X % 100;
      System.out.println(100 - reminder);
    }
  }
}
