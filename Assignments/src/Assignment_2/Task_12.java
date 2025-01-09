package Assignment_2;

public class Task_12 {
  public static int[][] array = new int[2][3];

  public static void main(String[] args) {
    int c = 0;
    for (int i = 0; i < array.length; ++i) {
      for (int j = 0; j < array[i].length; ++j) {
        array[i][j] = ++c;
      }
    }

    for (int i = 0; i < array.length; ++i) {
      for (int j = 0; j < array[i].length; ++j) {
        System.out.println(array[i][j]);
      }
    }
  }
}
