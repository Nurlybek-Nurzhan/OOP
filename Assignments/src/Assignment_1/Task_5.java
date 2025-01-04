package Assignment_1;

import java.util.Scanner;

public class Task_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature: ");
		int temperature = scanner.nextInt();
		if (temperature < 0) {
			System.out.println("it's cold outside");
		} else {
			System.out.println("it's warm outside");
		}
		scanner.close();
	}
}
