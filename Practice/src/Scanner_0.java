import java.util.Scanner;

public class Scanner_0 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name Nigga: ");
    String name = scanner.nextLine();
    System.out.println("Your name is: " + name);
    scanner.close();
  }
}
