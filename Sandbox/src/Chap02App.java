import java.util.Scanner;

public class Chap02App {

	public static void main(String[] args) {
		System.out.println("hello");
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter an integer: ");
//		int a = sc.nextInt();
//		System.out.print("Enter another integer:  ");
//		int b = sc.nextInt();
//		
//		double avg = ((double) a+(double) b) / 2;
//		
//		System.out.println("Average = "+avg);
//		
//		// if average is greater than 10 say woo-hoo, if not say boo
//		if (avg > 10) {
//			System.out.println("Avg is "+avg);
//			System.out.println("woo-hoo! greater than 10!!");
//		}
//		else {
//			System.out.println("boooo!!!  NOT greater than 10.  :(");
//			System.out.println("Avg is "+avg);
//		}
		
		
		// get a string from user and test if it equals 'yes'
		System.out.println("Enter 'yes' or 'no'");
		String str = sc.next();
		if (!str.equals("yes")) 
			System.out.println("User entered something besides yes");
		System.out.println("bye");
		sc.close();
	}

}
