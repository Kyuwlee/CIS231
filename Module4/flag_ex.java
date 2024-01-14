import java.util.Scanner;

public class flag_ex {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num, sum = 0;
		int flag = 1;
		while (flag == 1) {
			System.out.print("Enter your number ");
			num = scnr.nextInt();
			sum += num;
			if (sum > 100)
				flag = 0;
		}
		System.out.println("The total is " + sum);
		scnr.close();
	}

}
