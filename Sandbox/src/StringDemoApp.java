
public class StringDemoApp {

	public static void main(String[] args) {
		String code = "java";
		System.out.println("size is "+code.length());

		String name = "Mr. Freddy Mercury";
		int n1 = name.indexOf(" ");
		int n2 = name.indexOf(" ", n1+1);
		System.out.println(n1 + " " + n2);
		
		int n3 = name.indexOf("Fred");
		System.out.println(n3);
		
		String n4 = "Sean Blessing                      ";
		System.out.println(n4.trim() + "!!!!");
		
		String n5 = "John Hamm";
		String n5ln = n5.substring(5);
		System.out.println(n5ln);
		
		String n6 = "Martin Van Buren";
		int i1 = n6.indexOf(" ");
		int i2 = n6.indexOf(" ",i1+1);
		String midName = n6.substring(i1+1, i2);
		System.out.println(midName+".");
		
		String n7 = "Hello there ladies and gentlemen!!!";
		String n8 = n7.replace(' ', '#');
		System.out.println(n8);
		
		String[] n8Array = n8.split("#");
		System.out.println("# of words = "+n8Array.length);
	}

}
