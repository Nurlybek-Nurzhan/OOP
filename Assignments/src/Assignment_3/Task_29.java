package Assignment_3;

import java.util.Arrays;

public class Task_29 {
  public static void main(String[] args) {
    String[] memory = { "object15", null, null, "object2", null, null, null, null,
        "object32", null, "object4" };
    executeDefragmentation(memory);
    System.out.println(Arrays.toString(memory));
  }

  public static void executeDefragmentation(String[] array) {
    int insertPos = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != null) {
        array[insertPos++] = array[i];
      }
    }
    while (insertPos < array.length) {
      array[insertPos++] = null;
    }
  }
}
