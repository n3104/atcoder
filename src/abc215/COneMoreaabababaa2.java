package abc215;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * https://atcoder.jp/contests/abc215/tasks/abc215_c
 * 
 * 解説に載っていた整数のbit表現を利用して文字列を作成する方法を実装した。
 * https://atcoder.jp/contests/abc215/editorial/2484
 * 
 * & ですでに利用した文字を除外し、^ で残りの文字の位置を再帰的に伝達する。
 */
public class COneMoreaabababaa2 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      s = sc.next();
      int k = sc.nextInt();
      l = s.length();
      stringSet = new HashSet<String>(k);
      find((1 << l) - 1);
      List<String> stringList = new ArrayList<>(stringSet);
      Collections.sort(stringList);
      System.out.println(stringList.get(k - 1));
    }

  }

  static String s;
  static StringBuilder t = new StringBuilder();
  static int l;
  static Set<String> stringSet = null;

  static void find(int fl) {
    if (fl == 0) {
      stringSet.add(t.toString());
      return;
    }

    for (int i = 0; i < l; i++) {
      if ((fl & (1 << i)) > 0) {
        t.append(s.charAt(i));
        find(fl ^ (1 << i));
        t.delete(t.length() - 1, t.length());
      }
    }
  }
}

