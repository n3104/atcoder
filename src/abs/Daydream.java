package abs;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abs/tasks/arc065_a
 * 
 * 1時間半ぐらいで解けた。最初はマッチした以降の文字列を生成するように実装したらMLE (Memory Limit Exceeded) になった。
 * 
 * 入力された文字列を先頭から4つの単語に一致するかどうか毎回チェックすればいい。一致する場合は再度4つの単語に一致するかどうかチェックする。
 * 
 * チェックの都度残りの文字列を作って判定する方法だとどこまで読み取ったかの管理が不要になるが、入力が長い文字列の場合はメモリを大量に消費し、MLEとなる。そのため、単一の
 * StringBuilder のインスタンスに対してどこまで読み取ったかのインデックス管理をしつつ4つの単語に一致するかどうかの判定を行う。
 */
public class Daydream {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String S = sc.next();
      if (new Matcher(S).match(0)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

  static class Matcher {

    StringBuilder remainingStringToMatch;

    Matcher(String s) {
      remainingStringToMatch = new StringBuilder(s);
    }

    boolean match(int startIndexToMatch) {
      // System.out.println(startIndexToMatch);
      // 組み合わせが存在する場合、最後は index が length に一致する。
      if (startIndexToMatch == remainingStringToMatch.length()) {
        return true;
      } else if (startIndexToMatch > remainingStringToMatch.length()) {
        return false;
      }
      boolean result = false;
      if (prefixMatch("dream", remainingStringToMatch, startIndexToMatch)) {
        if (match(startIndexToMatch + 5)) {
          result = true;
        }
      }
      if (prefixMatch("dreamer", remainingStringToMatch, startIndexToMatch)) {
        if (match(startIndexToMatch + 7)) {
          result = true;
        }
      }
      if (prefixMatch("erase", remainingStringToMatch, startIndexToMatch)) {
        if (match(startIndexToMatch + 5)) {
          result = true;
        }
      }
      if (prefixMatch("eraser", remainingStringToMatch, startIndexToMatch)) {
        if (match(startIndexToMatch + 6)) {
          result = true;
        }
      }
      return result;
    }

    static boolean prefixMatch(String word, StringBuilder target, int startIndexToMatch) {
      if (word.length() + startIndexToMatch > target.length()) {
        return false;
      }
      // System.out.println(target.substring(startIndexToMatch, word.length() + startIndexToMatch));
      if (word.equals(target.substring(startIndexToMatch, word.length() + startIndexToMatch))) {
        return true;
      } else {
        return false;
      }
    }
  }
}
