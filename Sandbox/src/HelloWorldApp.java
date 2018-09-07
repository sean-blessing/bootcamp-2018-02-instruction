import java.util.Scanner;

public class HelloWorldApp {

	public static void main(String[] args) {
		// 1) welcome msg
		System.out.println("Welcome to the basic calculator!");
		Scanner sc = new Scanner(System.in);
		
		// 2) get user input
		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int number2 = sc.nextInt();

		// 3) biz logic
		int sum = number1 + number2;
		
		// 4) Display results
		System.out.println("Sum is: " + sum);
		
		// 5) bye
		System.out.println("Goodbye");
	}

}
