public class Swap {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println("Before swap: a = " + a + ", b = " + b);

    // Set a new variable
    int temp = a;

    // Swap
    a = b;
    b = temp;
    System.out.println("After swap: a = " + a + ", b = " + b);
  }
}
