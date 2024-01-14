package Module3;

import java.util.Scanner;

public class Assignment330 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();

		if ((x < -100 || x > 100) || (y < -100 || y > 100)) {
			System.out.println(0);
			System.exit(0);
		}

		if (x > 0) {
			if (y > 0)
				System.out.println(1);
			else
				System.out.println(4);
		} else {
			if (y < 0)
				System.out.println(3);
			else
				System.out.println(2);

		}
		System.out.println(Math.pow((double) 2, (double) 0));
		scanner.close();
	}
}
