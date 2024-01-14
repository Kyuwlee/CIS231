package Module3;

import java.util.Random;

public class Assignment32 {
	public static void main(String[] args) {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		int num1 = random.nextInt(0, 100);
		int num2 = random.nextInt(0, 100);
		int num3 = random.nextInt(0, 100);

		System.out.format("The gerated random numbers: %10d %10d %10d%n", num1, num2, num3);
		if (num1 < num2) {
			if (num1 < num3) {
				if (num2 < num3)
					System.out.format("%10d%10d%10d%n", num1, num2, num3);
				else
					System.out.format("%10d%10d%10d%n", num1, num3, num2);
			} else {
				if (num1 < num2)
					System.out.format("%10d%10d%10d%n", num3, num1, num2);
				else
					System.out.format("%10d%10d%10d%n", num3, num2, num1);
			}
		} else {
			if (num2 < num3) {
				if (num1 < num3)
					System.out.format("%10d%10d%10d%n", num2, num1, num3);
				else
					System.out.format("%10d%10d%10d%n", num2, num3, num1);
			} else {
				if (num1 < num2)
					System.out.format("%10d%10d%10d%n", num3, num1, num2);
				else
					System.out.format("%10d%10d%10d%n", num3, num2, num1);
			}
		}
	}

}
