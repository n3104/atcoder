package abc215;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * https://atcoder.jp/contests/abc215/tasks/abc215_c
 * 
 * とりあえず文字列を組み合わせを作って、後はソート＆ユニークにするアプローチ。
 */
public class COneMoreaabababaa {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String S = sc.next();
      int k = sc.nextInt();
      stringSet = new HashSet<String>(k);
      makeStrings("", S);
      List<String> stringList = new ArrayList<>(stringSet);
      Collections.sort(stringList);
      System.out.println(stringList.get(k - 1));
    }

  }

  static Set<String> stringSet = null;

  static void makeStrings(String prefix, String suffix) {
    if (suffix.equals("")) {
      stringSet.add(prefix);
      return;
    }
    List<Character> chars = suffix.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    for (int i = 0; i < chars.size(); i++) {
      Character c = chars.remove(i);
      makeStrings(prefix + c, chars.stream().map(String::valueOf).collect(Collectors.joining()));
      chars.add(i, c);
    }
  }
}

