
public class StringArrayDemoApp {

	public static void main(String[] args) {
		System.out.println("hello");

		String[] words = {"hey","there","how","you","doing?"};
		
		for (int i = 0; i < words.length; i++) {
			String s = words[i]+"ay";
			words[i] = s;
		}
		
		for (String s: words) {
			System.out.println(s);
		}
		
		System.out.println("bye");
	}

}
