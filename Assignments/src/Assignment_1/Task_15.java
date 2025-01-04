package Assignment_1;

public class Task_15 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 9; j++) {
        if (j == 2 * i || 8 - 2 * i == j || i == 2)
          System.out.print(8);
        else if (8 - 2 * i < j && j > 2 * i)
          break;
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}