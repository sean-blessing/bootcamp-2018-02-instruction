
public class ch03App {

	public static void main(String[] args) {
		System.out.println("hi");

		double x = 10.315;
		x = (double)Math.round(x*10)/10;
		System.out.println(x);
		System.out.println("bye");
		
		int a = 2;
		int b = 3;
		int result = Math.min(b, a);
		System.out.println(" min is "+result);
		// what does the ^ do???
		System.out.println(a^b);
		

	}

}
