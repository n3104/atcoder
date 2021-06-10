package abc204;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * https://atcoder.jp/contests/ABC204/tasks/abc204_c
 */
public class CTour {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(N);
      for (int i = 0; i < M; i++) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        List<Integer> list = map.get(A);
        if (list == null) {
          list = new ArrayList<>();
          map.put(A, list);
        }
        list.add(B);
      }
      int count = N;
      for (Integer city : map.keySet()) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(city);
        count += count(map, set, city);
      }
      System.out.println(count);
    }
  }

  static int count(Map<Integer, List<Integer>> map, Set<Integer> set, Integer city) {
    if (map.get(city) == null) {
      return 0;
    }
    int count = 0;
    for (Integer next : map.get(city)) {
      if (set.contains(next)) {
        continue;
      }
      count++;
      set.add(next);
      count += count(map, set, next);
    }
    return count;
  }
}
