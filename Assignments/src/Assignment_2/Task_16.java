package Assignment_2;

import java.util.Scanner;

public class Task_16 {
  public static char[][] array;

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();
      array = new char[n][n * 2 - 1];
      int k = 1;
      for (int i = 0; i < n; ++i) {
        int j;
        for (j = 0; j < n - 1 - k / 2; ++j) {
          array[i][j] = ' ';
        }
        int m;
        for (m = 0; m < k; ++m) {
          array[i][j + m] = '#';
        }
        m += j;
        while (++m < array[i].length) {
          array[i][m] = ' ';
        }
        k += 2;
      }

      for (int i = 0; i < array.length; ++i) {
        for (int j = 0; j < array[i].length; ++j) {
          System.out.print(array[i][j]);
        }
        System.out.println();
      }
    }
  }
}
