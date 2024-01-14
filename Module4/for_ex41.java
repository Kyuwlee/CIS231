import java.util.Scanner;

public class for_ex41 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int N = 5;
		int sum = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Enter the user number: ");
			int user_num = scnr.nextInt();
			sum += user_num;
		}
		System.out.format("The total accumulated user numbers is %d\n", sum);
		scnr.close();
	}

}
