package abc238;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc238/tasks/abc238_a
 * 
 * 結果的には解けたけど、桁あふれしてもおかしくないので偶然解けただけ。。
 * https://atcoder.jp/contests/abc238/editorial/3355
 */
public class AExponentialQuadratic {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      if (Math.pow(2, n) > Math.pow(n, 2)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
