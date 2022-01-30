package abc236;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc236/submissions/28744407
 */
public class CRouteMap {
  static final String BR = System.getProperty("line.separator");

  public static void main(String[] args) throws Exception {
    StringBuilder sb = new StringBuilder();
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      Queue<String> q1 = new LinkedList<String>();
      Queue<String> q2 = new LinkedList<String>();
      for (int i = 0; i < N; i++) {
        q1.add(sc.next());
      }
      for (int i = 0; i < M; i++) {
        q2.add(sc.next());
      }
      while (q1.isEmpty() == false) {
        String S = q1.poll();
        String T = q2.peek();
        if (S.equals(T)) {
          sb.append("Yes").append(BR);
          q2.remove();
        } else {
          sb.append("No").append(BR);
        }
      }
      System.out.print(sb.toString());
    }
  }
}
