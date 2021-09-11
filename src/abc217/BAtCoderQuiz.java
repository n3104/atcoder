package abc217;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * https://atcoder.jp/contests/abc217/tasks/abc217_b
 */
public class BAtCoderQuiz {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      Set<String> contests =
          Stream.of("ABC", "ARC", "AGC", "AHC").collect(Collectors.toCollection(HashSet::new));
      contests.remove(sc.next());
      contests.remove(sc.next());
      contests.remove(sc.next());
      System.out.println(contests.toArray()[0]);
    }
  }
}

