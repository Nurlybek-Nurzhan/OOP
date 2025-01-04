package Assignment_1;

import java.util.Locale;
import java.util.Scanner;

public class Task_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Enter the body temperature: ");
		float temperature = scanner.nextFloat();
		boolean isHigh = temperature >= 36.7;
		boolean isLow = temperature <= 36.5;
		if (isHigh) {
			System.out.println("The body temperature is high.");
		} else if (isLow) {
			System.out.println("The body temperature is low.");
		} else {
			System.out.println("The body temperature is normal.");
		}
		scanner.close();
	}
}
