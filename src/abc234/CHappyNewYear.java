package abc234;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc234/submissions/28401188
 */
public class CHappyNewYear {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String K = sc.next();
      System.out.println((new BigInteger(K)).toString(2).replace('1', '2'));
    }
  }
}
