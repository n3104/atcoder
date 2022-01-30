package abc236;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc236/submissions/28934382
 * 
 * 解説を読んで、実装した。
 * https://atcoder.jp/contests/abc236/editorial/3285
 */
public class DDance {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      A = new int[2 * N][2 * N];
      for (int i = 0; i < 2 * N; i++) {
        for (int j = i + 1; j < 2 * N; j++) {
          A[i][j] = sc.nextInt();
        }
      }
      used = new boolean[2 * N];
      System.out.println(calc());;
    }
  }

  static int N;
  static int[][] A;
  static boolean[] used;
  static List<Integer[]> pairList = new ArrayList<>();

  static int calc() {
    if (pairList.size() == N) {
      int result = 0;
      for (int i = 0; i < pairList.size(); i++) {
        Integer[] pair = pairList.get(i);
        result ^= A[pair[0]][pair[1]];
      }
      return result;
    }

    int left = 0;
    for (int i = 0; i < used.length; i++) {
      if (used[i] == false) {
        left = i;
        break;
      }
    }
    used[left] = true;

    int result = 0;
    for (int i = 0; i < used.length; i++) {
      if (used[i]) {
        continue;
      }
      int right = i;
      used[i] = true;
      pairList.add(new Integer[] {left, right});
      result = Math.max(result, calc());
      pairList.remove(pairList.size() - 1);
      used[i] = false;
    }

    used[left] = false;
    return result;
  }
}
