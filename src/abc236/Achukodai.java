package abc236;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc236/submissions/28732506
 */
public class Achukodai {
  static final String BR = System.getProperty("line.separator");

  public static void main(String[] args) throws Exception {
    StringBuilder sb = new StringBuilder();
    try (Scanner sc = new Scanner(System.in)) {
      String S = sc.next();
      int a = sc.nextInt();
      int b = sc.nextInt();
      sb.append(S);
      sb.replace(a - 1, a, S.substring(b - 1, b));
      sb.replace(b - 1, b, S.substring(a - 1, a));
      System.out.print(sb.toString());
    }
  }
}
