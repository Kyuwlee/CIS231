import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
	public static void main(String[] args) throws FileNotFoundException {
		File fp = new File("integers.txt");
		Scanner sc = new Scanner(fp);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		System.out.format("Num1: %d%n  Num2: %d%n  Num3: %d%n", num1, num2, num3);
		sc.close();

	}

}
