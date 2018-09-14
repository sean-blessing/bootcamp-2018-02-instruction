
public class HumanApp {

	public static void main(String[] args) {
		System.out.println("hi");

		Human sean = new Human("Sean", "brown", "brown");
		
		System.out.println("Human instance created:  "+sean);
		
		System.out.println("Friday, off work, goes to happy hour...");
		sean.drinkBeer(2);
		System.out.println("Getting late... night night.");
		int n = sean.sleep();
		System.out.println("Sean slept "+ n +" hours.");
		System.out.println("bye");
	}

}
