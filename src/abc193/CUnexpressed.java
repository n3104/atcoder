package abc193;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * https://atcoder.jp/contests/abc193/tasks/abc193_c
 */
public class CUnexpressed {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      long N = sc.nextLong();
      Set<Long> set = new HashSet<>();
      for (int i = 2; true; i++) {
        long number = i;
        boolean unexpressed = true;
        while (true) {
          number = number * i;
          if (number <= N) {
            set.add(number);
            unexpressed = false;
          } else {
            break;
          }
        }
        if (unexpressed) {
          break;
        }
      }
      System.out.println(N - set.size());
    }
  }
}
