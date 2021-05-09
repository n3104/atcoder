package abc200;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc200/tasks/abc200_c
 * 
 * 組の個数を出すところはループする必要はなくて単に組み合わせの数を計算で出せばいいだけだったorz
 * https://atcoder.jp/contests/abc200/editorial/1245
 */
public class CRingosFavoriteNumbers2 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      long[] As = new long[N];
      List<List<Integer>> numberIndices = new ArrayList<List<Integer>>();
      for (int i = 0; i < 200; i++) {
        numberIndices.add(new ArrayList<Integer>());
      }
      for (int i = 0; i < As.length; i++) {
        Long A = sc.nextLong();
        int remainder = (int) (A % 200);
        numberIndices.get(remainder).add(i);
      }
      long count = 0;
      for (List<Integer> list : numberIndices) {
        if (list.size() < 2) {
          continue;
        }
        for (int i = 0; i < list.size(); i++) {
          count += list.size() - (i + 1);
        }
      }
      System.out.println(count);
    }
  }
}
