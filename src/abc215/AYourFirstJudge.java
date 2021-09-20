package abc215;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc215/tasks/abc215_a
 */
public class AYourFirstJudge {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      if ("Hello,World!".equals(sc.next())) {
        System.out.println("AC");
      } else {
        System.out.println("WA");
      }
    }
  }
}
