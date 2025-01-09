package Assignment_2;

public class Task_22 {
  public static void main(String[] args) {
    int[] array = new int[] { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
    printArray(array);
    reverseArray(array);
    printArray(array);
  }

  public static void reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; ++i) {
      int t = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = t;
    }
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; ++i) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
