package abc206;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc206/tasks/abc206_c
 * 
 * 方針2 の解き方で解いた。最初から思いつかなくて残念。。
 * https://atcoder.jp/contests/abc206/editorial/2096
 */
public class CSwappable {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < N; i++) {
        int a = sc.nextInt();
        Integer count = map.get(a);
        if (count == null) {
          count = 0;
        }
        map.put(a, count + 1);
      }
      long total = 0;
      for (int a : map.keySet()) {
        int count = map.get(a);
        if (count == 1) {
          total += N - 1;
        } else {
          total += (N - count) * (long) count;
        }
      }
      System.out.println(total / 2);
    }
  }
}
