package Assignment_1;

public class Task_12 {
  public static void main(String[] args) {
    int sum = 0;
    int number = 1;

    while (number <= 100) {
      if (number % 3 == 0) {
        number++;
        continue;
      }
      sum += number;
      number++;
    }

    System.out.println("The sum of numbers from 1 to 100 not divisible by 3 is: " + sum);
  }
}
