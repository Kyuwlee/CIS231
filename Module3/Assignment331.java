package Module3;

import java.util.Scanner;

public class Assignment331 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char c = scanner.next().charAt(0);
		switch (c) {
			case 'a':
			case 'A':
				System.out.println("The score range is 90 ~ 100");
				break;
			case 'b':
			case 'B':
				System.out.println("The score range is 80 ~ 89");
				break;
			case 'c':
			case 'C':
				System.out.println("The score range is 70 ~ 79");
				break;
			case 'd':
			case 'D':
				System.out.println("The score range is 60 ~ 69");
				break;
			default:
				System.out.println("The score range is 0 ~ 59");
		}
		scanner.close();
	}

}
