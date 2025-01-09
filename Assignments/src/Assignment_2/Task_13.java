package Assignment_2;

import java.util.Scanner;

public class Task_13 {
  public static int[][] array = new int[3][3];

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      for (int i = 0; i < array.length; ++i) {
        for (int j = 0; j < array[i].length; ++j) {
          array[i][j] = s.nextInt();
        }
      }
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < array.length; ++i) {
        for (int j = 0; j < array[i].length; ++j) {
          if (array[i][j] > max)
            max = array[i][j];
        }
      }
    }
  }
}
