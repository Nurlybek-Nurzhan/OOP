package Assignment_1;

import java.util.Scanner;

public class Task_14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter start: ");
    int start = scanner.nextInt();
    System.out.println("Enter end: ");
    int end = scanner.nextInt();

    while (start >= end) {
      System.out.println("Start should be less than End. Please enter the integers again.");
      System.out.println("Enter start: ");
      start = scanner.nextInt();
      System.out.println("Enter end: ");
      end = scanner.nextInt();
    }

    System.out.println("Enter multiple: ");
    int multiple = scanner.nextInt();
    int sum = 0;

    for (int i = start; i < end; i++) {
      if (i % multiple == 0) {
        sum += i;
      } else {
        continue;
      }
    }
    System.out.println("Sum: " + sum);
    scanner.close();
  }
}
