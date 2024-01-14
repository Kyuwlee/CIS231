import java.util.Scanner;

public class for_ex42 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int N = 5;
		int i = 0, sum = 0;
		int user_num;

		while (i < N) {
			System.out.print("Enter your number: ");
			user_num = scnr.nextInt();
			sum += user_num;
			i += 1;
		}
		System.out.format("The total accumulated user numbers is %d\n", sum);
		scnr.close();
	}

}
