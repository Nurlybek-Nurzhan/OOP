package Assignment_2;

import java.util.Scanner;

public class Task_5 {
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();
      int[] array = new int[n];

      for (int i = 0; i < n; ++i) {
        array[i] = s.nextInt();
      }

      if (n % 2 == 0) {
        for (int i = array.length - 1; i >= 0; --i) {
          System.out.println(array[i]);
        }
      } else {
        for (int i = 0; i < array.length; ++i) {
          System.out.println(array[i]);
        }
      }
    }
  }
}
