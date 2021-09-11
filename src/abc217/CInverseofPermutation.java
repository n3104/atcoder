package abc217;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * https://atcoder.jp/contests/abc217/tasks/abc217_c
 */
public class CInverseofPermutation {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int[] Q = new int[N];
      for (int pi = 1; pi <= N; pi++) {
        int qi = sc.nextInt() - 1;
        Q[qi] = pi;
      }
      System.out
          .println(Arrays.stream(Q).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
  }
}

