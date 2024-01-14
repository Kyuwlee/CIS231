import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int user_num;

		while (true) {
			try {
				user_num = scnr.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("Value error");
				scnr.next();
				continue;
			}
		}
		System.out.format("User input is %d\n", user_num);
		scnr.close();

	}

}
