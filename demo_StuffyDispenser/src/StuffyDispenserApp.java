import java.util.Scanner;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy dispenser app!");
		Scanner sc = new Scanner(System.in);
		
		String name = promptString("Enter stuffy name: ", sc);
		String type = promptString("Enter stuffy type (Monkey, Bear, Elephant, etc): ", sc);
		String color = promptString("Enter stuffy color: ", sc);
		
		Stuffy s = new Stuffy(name, type, color);
		
		System.out.println("Here's your new stuffy!");
		System.out.println(s.toString());
		System.out.println("bye!");
	}
	
	private static String promptString(String prompt, Scanner scanner) {
		System.out.print(prompt);
		return scanner.next();
	}

}
