package abc194;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc194/tasks/abc194_c
 * 
 * 解けなかった。解き方は解説に記載の通り。
 * https://atcoder.jp/contests/abc194/editorial/826
 */
public class CSquaredError {
  public static void main(String[] args) {
    int maxA = 200;
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      Map<Integer, Integer> map = new HashMap<>(maxA * 2 + 1);
      for (int i = 0; i < N; i++) {
        int A = sc.nextInt();
        map.put(A, map.getOrDefault(A, 0) + 1);
      }
      long result = 0;
      for (Integer Ai : map.keySet()) {
        for (Integer Aj : map.keySet()) {
          // System.out.println(Ai + " - " + Aj);
          long diff = Ai - Aj;
          result += diff * diff * map.get(Ai) * map.get(Aj);
        }
      }
      // 各要素同士の差、つまり組み合わせなので最後に 2 で割る。
      System.out.println(result / 2);
    }
  }
}
