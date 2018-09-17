import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		LocalDate halloween = LocalDate.of(2018, 10, 31);
		System.out.println(halloween);
		
		LocalDate christmas = LocalDate.of(2018, 12, 25);
		System.out.println(christmas);
		
		LocalDateTime thanksgiving = LocalDateTime.of(2018, 11, 22, 13, 00, 00);
		System.out.println(thanksgiving);
		System.out.println("Thanksgiving is on a "+thanksgiving.getDayOfWeek());
		System.out.println("Christmas day of year: "+christmas.getDayOfYear());
		
		if (halloween.isBefore(christmas)) {
			System.out.println("true");
		}
		
		LocalDateTime future = LocalDateTime.of(2018, 9, 22, 13, 00, 00);

		LocalDate nextChristmas = LocalDate.of(2019, 12, 25);
		System.out.println(halloween.compareTo(nextChristmas));
		
		LocalDate changeHalloween = halloween.withMonth(2);
		System.out.println(changeHalloween);
		LocalDate halloweenEve = LocalDate.of(2018, 10, 30);
		LocalDate changeHalloweenEve = halloweenEve.withMonth(2);
		System.out.println(changeHalloweenEve);
		LocalDate feb29 = changeHalloweenEve.plus(1,ChronoUnit.DAYS);
		System.out.println(feb29);
		
		DateTimeFormatter dateF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(dateF.format(future));

	}

}
