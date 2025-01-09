package Assignment_2;

import java.util.Scanner;

public class Task_10 {
  public static int[][] multiArray;

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();
      int[] sizes = new int[n];
      for (int i = 0; i < n; ++i) {
        sizes[i] = s.nextInt();
      }

      multiArray = new int[n][];
      for (int i = 0; i < n; ++i) {
        multiArray[i] = new int[sizes[i]];
      }
    }
  }
}
