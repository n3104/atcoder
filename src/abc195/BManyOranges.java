package abc195;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc195/tasks/abc195_b
 * 
 * 解けなかった。解説を読んで理解できたと思う。
 * https://atcoder.jp/contests/abc195/editorial/836
 * 
 * A*N <= W * 1000 <= B*N とのことで、要はBが超えてるから、
 * その範囲内の値をAに分け与えればちょうどWになるってことなんだと思う。
 */
public class BManyOranges {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int w = sc.nextInt() * 1000;
      int n = 1000 * 1000;
      int min = n;
      int max = 0;
      for (int i = 1; i <= n; i++) {
        if (A * i <= w && w <= B * i) {
          min = Integer.min(i, min);
          max = Integer.max(i, max);
        }
      }
      if (max == 0) {
        System.out.println("UNSATISFIABLE");
      } else {
        System.out.println(min + " " + max);
      }
    }
  }
}
