
public class BigDecTestApp {

	public static void main(String[] args) {
		double thisYtd = 56888.96;
		double lastYtd = 45344.32;
		System.out.println(thisYtd - lastYtd);
		long salesChange = Math.round(thisYtd - lastYtd);
		System.out.println(salesChange);

	}

}
