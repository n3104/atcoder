package abc075;

import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc075/tasks/abc075_b
 * 
 * 1時間ぐらいで解けた。
 * 
 * 爆弾の数を数える際に端のマスの判定をなくす意図でマス目を読み取る際にマス目の外側に空きマスを用意してみた。
 */
public class Minesweeper {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int H = sc.nextInt();
      int W = sc.nextInt();
      // まずはマス目を読み取る。その際に端のマス目の外側に空きマスを用意しておく。
      char[][] grid = new char[H + 2][W + 2];
      for (int i = 0; i < grid.length; i++) {
        char[] row = new char[W + 2];
        grid[i] = row;
        for (int j = 0; j < row.length; j++) {
          row[j] = '.';
        }
        // 先頭と最終行はマス目の外側なので空きマスのままにしておく。
        if (i == 0 || i == grid.length - 1) {
          continue;
        }
        String inputString = sc.next();
        for (int j = 0; j < inputString.length(); j++) {
          row[j + 1] = inputString.charAt(j);
        }
      }
      // マス目を元に出力する。
      for (int i = 1; i < grid.length - 1; i++) {
        char[] row = grid[i];
        for (int j = 1; j < row.length - 1; j++) {
          System.out.print(getNumberOfBomb(grid, i, j));
        }
        System.out.println();
      }
    }
  }

  static char getNumberOfBomb(char[][] grid, int i, int j) {
    if (grid[i][j] == '#') {
      return '#';
    }
    int numberOfBomb = 0;
    for (int k = -1; k <= 1; k++) {
      for (int l = -1; l <= 1; l++) {
        if (k == 0 && l == 0) {
          continue;
        }
        if (grid[i + k][j + l] == '#') {
          numberOfBomb++;
        }
      }
    }
    return Character.forDigit(numberOfBomb, 10);
  }
}
