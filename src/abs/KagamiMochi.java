package abs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * https://atcoder.jp/contests/abs/tasks/abc085_b
 * 
 * 20分ぐらいで解けた。
 * 
 * 単にユニークにしてソートして、一番長い区間を探すだけ。
 */
public class KagamiMochi {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      Set<Integer> set = new HashSet<Integer>(n);
      for (int i = 0; i < n; i++) {
        set.add(sc.nextInt());
      }
      int[] d = set.stream().mapToInt(Number::intValue).toArray();
      Arrays.sort(d);

      int maximumNumberOfLayers = 0;
      int currentNumberOfLayers = 0;
      int previousLayerSize = 0;
      for (int i = 0; i < d.length; i++) {
        if (d[i] > previousLayerSize) {
          currentNumberOfLayers++;
        } else {
          currentNumberOfLayers = 0;
        }
        if (currentNumberOfLayers > maximumNumberOfLayers) {
          maximumNumberOfLayers = currentNumberOfLayers;
        }
        previousLayerSize = d[i];
      }
      System.out.println(maximumNumberOfLayers);
    }
  }
}
