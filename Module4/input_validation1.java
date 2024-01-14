import java.util.Scanner;

public class input_validation1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int user_num;

		System.out.print("Enter a number ");
		while (((user_num = scnr.nextInt()) < 0) || user_num > 100) {
			System.out.print("Invalid number. Enter a number again : ");
		}
		System.out.format("The user number is %d\n", user_num);
		scnr.close();
	}

}
