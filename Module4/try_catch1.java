import java.util.Scanner;

public class try_catch1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int user_num = -1;
		try {
			user_num = scnr.nextInt();
			System.out.println("User number is " + user_num);
		} catch (Exception e) {
			System.err.println("Invalid input. Enter the numeric value");
			e.printStackTrace();
		}

		System.out.println("Check this print statement when it is executed ");
		System.out.println("User number is " + user_num);

		scnr.close();
	}
}
