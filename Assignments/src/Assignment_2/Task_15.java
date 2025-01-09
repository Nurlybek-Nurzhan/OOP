package Assignment_2;

import java.util.Scanner;

public class Task_15 {
  public static int[][] array = new int[3][3];

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      for (int i = 0; i < array.length; ++i) {
        for (int j = 0; j < array[i].length; ++j) {
          array[i][j] = s.nextInt();
        }
      }

      for (int i = 0; i < array.length; ++i) {
        for (int j = i; j < array[i].length; ++j) {
          int t = array[i][j];
          array[i][j] = array[j][i];
          array[j][i] = t;
        }
      }

      for (int i = 0; i < array.length; ++i) {
        for (int j = 0; j < array[i].length; ++j) {
          System.out.print(array[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}
