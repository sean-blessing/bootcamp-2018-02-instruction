import java.util.Scanner;

public class TempApp {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter price:  ");
		double price = sc.nextDouble();
		System.out.println("This is your #:  " + price);
		
		
		System.out.println("Bye!");
		sc.close();
	}

}
