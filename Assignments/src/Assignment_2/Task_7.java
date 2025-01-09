package Assignment_2;

import java.util.Scanner;

public class Task_7 {
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      String[] arr = new String[6];
      for (int i = 0; i < 6; ++i) {
        arr[i] = s.nextLine();
      }

      for (int i = 0; i < 6; ++i) {
        String t = arr[i];
        if (t == null)
          continue;
        boolean found = false;
        for (int j = i + 1; j < 6; ++j) {
          if (t.equals(arr[j])) {
            arr[j] = null;
            found = true;
          }
        }
        if (found)
          arr[i] = null;
      }

      for (int i = 0; i < arr.length; ++i) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}
