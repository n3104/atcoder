package abc244;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc244/tasks/abc244_c
 */
public class CYamanoteLineGame {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      List<Integer> list = new ArrayList<>();
      for (int i = 1; i <= N * 2 + 1; i++) {
        list.add(i);
      }
      while (true) {
        System.out.println(list.get(0));
        list.remove(0);
        int x = sc.nextInt();
        if (x == 0) {
          break;
        }
        list.remove(Integer.valueOf(x));
      }
    }
  }
}
