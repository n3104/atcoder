package abc192;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc192/tasks/abc192_c
 */
public class CKaprekarNumber {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      long N = sc.nextInt();
      int K = sc.nextInt();
      long a = N;
      for (int i = 0; i < K; i++) {
        char[] ca = String.valueOf(a).toCharArray();
        Arrays.sort(ca);
        long g2 = Long.valueOf(String.valueOf(ca));
        reverse(ca);
        long g1 = Long.valueOf(String.valueOf(ca));
        a = g1 - g2;
        if (a == 0) {
          break;
        }
      }
      System.out.println(a);
    }
  }

  static void reverse(char[] ca) {
    for (int i = 0; i < ca.length / 2; i++) {
      char temp = ca[i];
      ca[i] = ca[ca.length - i - 1];
      ca[ca.length - i - 1] = temp;
    }
  }
}
