package abc200;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc200/tasks/abc200_b
 * 
 * 念の為 BigDecimal を利用したが long で十分だった。
 * https://atcoder.jp/contests/abc200/editorial/1244
 */
public class B200thABC200 {

  public static void main(String[] args) {
    final BigDecimal TWO_HUNDRED = new BigDecimal(200);
    final BigDecimal THOUSAND = new BigDecimal(1000);
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      BigDecimal r = new BigDecimal(N);
      for (int i = 0; i < K; i++) {
        if (r.remainder(TWO_HUNDRED).equals(BigDecimal.ZERO)) {
          r = r.divide(TWO_HUNDRED);
        } else {
          r = r.multiply(THOUSAND);
          r = r.add(TWO_HUNDRED);
        }
      }
      System.out.println(r);
    }
  }
}
