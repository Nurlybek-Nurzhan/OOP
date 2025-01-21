public class MainReverserApp {
  public static void main(String[] args) {

    int[] numbers = { 10, 20, 30, 40, 50 };

    int[] reversed = ArrayReverser.reverseArray(numbers);

    System.out.println("Reversed Array:");
    for (int num : reversed) {
      System.out.print(num + " ");
    }
  }
}