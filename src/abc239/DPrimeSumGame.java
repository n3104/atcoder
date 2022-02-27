package abc239;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * https://atcoder.jp/contests/abc239/tasks/abc239_d
 */
public class DPrimeSumGame {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      primeNumbers = generatePrimeNumbers(200);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      for (int i = A; i <= B; i++) {
        boolean existsPrimeNubmer = false;
        for (int j = C; j <= D; j++) {
          if (isPrimeNumber(i + j)) {
            existsPrimeNubmer = true;
            break;
          }
        }
        if (existsPrimeNubmer == false) {
          System.out.println("Takahashi");
          return;
        }
      }
      System.out.println("Aoki");
    }
  }

  static Set<Integer> primeNumbers;

  private static Set<Integer> generatePrimeNumbers(int x) {
    Set<Integer> set = new HashSet<>();
    for (int i = 2; i <= x; i++) {
      boolean isPrimeNubmer = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrimeNubmer = false;
          break;
        }
      }
      if (isPrimeNubmer) {
        set.add(i);
      }
    }
    return set;
  }

  private static boolean isPrimeNumber(int x) {
    return primeNumbers.contains(x);
  }
}
