package abc206;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc206/tasks/abc206_b
 */
public class BSavings {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int base = ((int) Math.sqrt(2 * N)) - 1;
      int sum = ((1 + base) * base) / 2;
      int i = base;
      while (true) {
        if (sum >= N) {
          System.out.println(i);
          return;
        }
        i++;
        sum += i;
      }
    }
  }
}
