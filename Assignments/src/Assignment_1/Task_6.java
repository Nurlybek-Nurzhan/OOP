package Assignment_1;

import java.util.Scanner;

public class Task_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scanner.nextLine();
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		if (age >= 18 && age <= 28) {
			System.out.println(name + ", come to the military registration and enlistment office");
		} else {
			System.out.println(name + ", you are not eligible for enlistment");
		}
		scanner.close();
	}
}
