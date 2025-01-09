package Assignment_2;

public class Task_11 {
  public static int[][][] multiarray = new int[][][] { { { 4, 8, 15 }, { 16 } }, { { 23, 42 }, {} },
      { { 1 }, { 2 }, { 3 }, { 4, 5 } } };

  public static void main(String[] args) {
    System.out.println("{ ");
    for (int i = 0; i < multiarray.length; ++i) {
      System.out.print("{ ");
      for (int j = 0; j < multiarray[i].length; ++j) {
        System.out.print("{ ");
        for (int k = 0; k < multiarray[i][j].length; ++k) {
          System.out.print(multiarray[i][j][k] + " ");
        }
        System.out.print("} ");
      }
      System.out.println("}");
    }
    System.out.println("}");
  }
}
