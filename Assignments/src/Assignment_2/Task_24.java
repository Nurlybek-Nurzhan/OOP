package Assignment_2;

import java.util.Scanner;

public class Task_24 {
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      signIn(s.nextLine());
    }
  }

  public static void signIn(String username) {
    if ("user".equals(username)) {
      return;
    }
    System.out.println("Welcome, " + username);
    System.out.println("Missed you very much, " + username);
  }
}
