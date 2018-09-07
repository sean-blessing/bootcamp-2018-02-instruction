import java.text.NumberFormat;

public class ch003FormatApp {

	public static void main(String[] args) {
		double price = 11.5751;
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Formatted price = " + cf.format(price));
		System.out.println("another one = "+cf.format(55.67));

		double majority = .505;
		NumberFormat pf = NumberFormat.getPercentInstance();
		System.out.println("Formatted percent = " + pf.format(majority));
	}

}
