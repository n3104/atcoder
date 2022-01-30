package abc236;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc236/submissions/28739533
 */
public class BWhoismissing {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int totalNumberOfCards = N * 4 - 1;
      int[] eachCardsCount = new int[N];
      for (int i = 0; i < totalNumberOfCards; i++) {
        int a = sc.nextInt();
        eachCardsCount[a - 1]++;
      }
      for (int i = 0; i < eachCardsCount.length; i++) {
        int count = eachCardsCount[i];
        if (count == 3) {
          System.out.println(i + 1);
          return;
        }
      }
    }
  }
}
