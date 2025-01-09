package Assignment_2;

import java.util.Scanner;

public class Task_6 {
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();

      if (n <= 0) {
        System.out.println('0');
        return;
      }

      int[] array = new int[n];

      for (int i = 0; i < n; ++i) {
        array[i] = s.nextInt();
      }

      int max = Integer.MIN_VALUE;
      for (int i = 0; i < n; ++i) {
        if (array[i] > max)
          max = array[i];
      }

      System.out.println(max);
    }
  }
}
