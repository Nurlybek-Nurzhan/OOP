
/**
 * CheatList for "Introduction to Classes, Objects, Methods, access modifiers,
 * Constructor, Getter and Setter" topic
 */
class CheatList_MidTerm {

	/**
	 * Example of a class with a constructor
	 */
	class Person {
		String name;
		int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		void sayHello() {
			System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
		}
	}

	/**
	 * Example of a class with private fields and public getter and setter methods
	 */
	class BankAccount {
		private double balance;

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public void deposit(double amount) {
			balance += amount;
		}

		public void withdraw(double amount) {
			balance -= amount;
		}
	}

	/**
	 * Example of a class with public static method
	 */
	class MathUtils {
		public static int add(int a, int b) {
			return a + b;
		}

		public static int multiply(int a, int b) {
			return a * b;
		}
	}

	/**
	 * Example of a class with private static field and public static method to
	 * access it
	 */
	class Counter {
		private static int count = 0;

		public static int getCount() {
			return count;
		}

		public static void incrementCount() {
			count++;
		}
	}

	/**
	 * Example of a class with protected field and public method to access it
	 */
	class Animal {
		protected String sound;

		public void makeSound() {
			System.out.println(sound);
		}
	}

	/**
	 * Example of a class with final field
	 */
	class Circle {
		final double PI = 3.14;

		double getArea(double radius) {
			return PI * radius * radius;
		}
	}

	/**
	 * Example of a class with abstract method
	 */
	abstract class Shape {
		abstract double getArea();
	}

	/**
	 * Example of a class with interface implementation
	 */
	interface Printable {
		void print();
	}

	class Document implements Printable {
		public void print() {
			System.out.println("Printing document...");
		}
	}

	public static void main(String[] args) {
		CheatList_MidTerm cheatList = new CheatList_MidTerm();
		Person person = cheatList.new Person("John Doe", 30);
		person.sayHello();

		BankAccount account = cheatList.new BankAccount();
		account.deposit(100);
		System.out.println("Account balance: " + account.getBalance());

		System.out.println("2 + 2 = " + MathUtils.add(2, 2));

		System.out.println("Count: " + Counter.getCount());
		Counter.incrementCount();
		System.out.println("Count after increment: " + Counter.getCount());

		Animal animal = cheatList.new Animal();
		animal.sound = "Woof";
		animal.makeSound();

		Circle circle = cheatList.new Circle();
		System.out.println("Area of circle with radius 5 is: " + circle.getArea(5));

		Shape shape = cheatList.new Shape() {
			@Override
			double getArea() {
				return 0;
			}
		};
		System.out.println("Area of shape: " + shape.getArea());

		Printable document = cheatList.new Document();
		document.print();
	}
}
