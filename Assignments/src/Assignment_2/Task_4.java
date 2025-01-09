package Assignment_2;

public class Task_4 {
  public static int[] firstArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
  public static int[] secondArray = new int[] { 11, 12, 13, 14, 15, 16, 16, 17, 18, 19, 20 };
  public static int[] resultArray;

  public static void main(String[] args) {
    resultArray = new int[firstArray.length + secondArray.length];
    System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
    System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);
    for (int i = 0; i < resultArray.length; ++i) {
      System.out.print(resultArray[i] + " ");
    }
  }
}
