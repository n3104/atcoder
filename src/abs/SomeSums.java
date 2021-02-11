package abs;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abs/tasks/abc083_b
 * 
 * 10分ぐらいで解けた。
 * 
 * 単に入力された数値を文字列にして、各桁の数字を足し合わせるだけ。
 */
public class SomeSums {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = 0;
      for (int i = 1; i <= n; i++) {
        int sumOfDigits = toSumOfDigits(i);
        if (a <= sumOfDigits && sumOfDigits <= b) {
          sum += i;
        }
      }
      System.out.println(sum);
    }
  }

  private static int toSumOfDigits(int i) {
    char[] ca = String.valueOf(i).toCharArray();
    int sum = 0;
    for (char c : ca) {
      sum += Integer.parseInt(String.valueOf(c));
    }
    return sum;
  }
}
