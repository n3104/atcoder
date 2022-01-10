package abc234;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc234/tasks/abc234_d
 * 
 * 考え方は公式解説参照。
 * https://atcoder.jp/contests/abc234/editorial/3222
 * 
 * 最初は i 毎に System.out.print で出力したら2秒以上かかってTLEになった。
 * https://atcoder.jp/contests/abc234/submissions/28437978
 * 
 * そのため一旦 StringBuilder に貯めて最後にまとめて出力したら1秒以上早くなってパスした。
 * https://atcoder.jp/contests/abc234/submissions/28445947
 */
public class DPrefixKthMax {

  public static void main(String[] args) {
    String br = System.getProperty("line.separator");
    StringBuilder sb = new StringBuilder();
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>(K);
      for (int i = 0; i < K; i++) {
        pq.add(sc.nextInt());
      }
      int v = pq.peek();
      sb.append(v).append(br);
      for (int i = K; i < N; i++) {
        int next = sc.nextInt();
        if (next > v) {
          pq.poll();
          pq.add(next);
          v = pq.peek();
        }
        sb.append(v).append(br);
      }
      System.out.print(sb.toString());
    }
  }
}
