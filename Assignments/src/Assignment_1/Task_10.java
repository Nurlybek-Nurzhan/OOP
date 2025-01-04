package Assignment_1;

import java.util.Scanner;

public class Task_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		String stopWord = "ENTER";
		System.out.println("Enter integers to sum and type 'ENTER' to finish:");
		while (true) {
			String input = scanner.nextLine();
			if (input.equals(stopWord)) {
				break;
			}
			int number = Integer.parseInt(input);
			sum += number;
		}
		System.out.println("The sum of the entered integers is: " + sum);
		scanner.close();
	}
}
