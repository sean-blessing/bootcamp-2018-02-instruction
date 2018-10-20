import java.util.ArrayList;
import java.util.List;

public class StreamsDemo1App {

	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(98);
		grades.add(92);
		grades.add(94);
		grades.add(95);
		grades.add(88);
		grades.add(100);
		
		System.out.println("Grades via old school for loop");
		for (int i=0; i<grades.size(); i++) {
			System.out.println("Grade"+i+" = "+grades.get(i));
		}

		System.out.println("\nGrades via enhanced for loop");
		for (Integer i: grades) {
			System.out.println("Grade = "+i);
		}

		System.out.println("\nGrades via stream");
		grades.stream().forEach(System.out::println);

		
	}

}
