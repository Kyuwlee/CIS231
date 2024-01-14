package Module3;

import java.util.Scanner;

public class Assignment333 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String email = scanner.next();

		if (email.length() <= 5 || email.length() >= 30) {
			System.out.println("False");
			System.exit(0);
		}
		if (email.contains("@")) {
			int idx = email.indexOf("@");
			if (!(email.substring(idx, email.length() - 1).contains("."))) {
				System.out.println("False");
				System.exit(0);
			}
		} else {
			System.out.println("False");
			System.exit(0);
		}
		char first = email.charAt(0);
		if (!(Character.isLetter(first))) {
			System.out.println("False");
			System.exit(0);
		}
		System.out.println("True");
		scanner.close();
	}
}
