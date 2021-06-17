package abc205;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * https://atcoder.jp/contests/abc205/tasks/abc205_b
 */
public class BPermutationCheck {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      Set<Integer> set = new HashSet<>(N);
      for (int i = 0; i < N; i++) {
        int A = sc.nextInt();
        if (set.contains(A)) {
          System.out.println("No");
          return;
        }
        set.add(A);
      }
      System.out.println("Yes");
    }
  }
}
