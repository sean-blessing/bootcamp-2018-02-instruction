import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Chap15FileDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("hi");
		String dirString = "c:/test/test2/test3/test4";
		String dirString2 = "files/products.txt";
		Path dirPath = Paths.get(dirString);
		Path dirPath2 = Paths.get(dirString2);
		if (Files.notExists(dirPath)) {
			System.out.println(dirPath+" created");
			Files.createDirectories(dirPath);
		}
		else {
			System.out.println("dir already exists");
		}
		if (Files.notExists(dirPath2)) {
			System.out.println(dirPath2+" created");
			Files.createFile(dirPath2);
		}
		else {
			System.out.println("dir2 already exists");
		}
		System.out.println("Bye");
	}

}
