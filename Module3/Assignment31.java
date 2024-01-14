package Module3;

import java.util.Random;

public class Assignment31 {

	public static void main(String[] args) {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		int num1 = random.nextInt(100);
		int num2 = random.nextInt(100);
		int num3 = random.nextInt(100);

		System.out.format("The gerated random numbers: %10d %10d %10d%n", num1, num2, num3);
		if (num1 > num2) {
			if (num1 > num3)
				System.out.println("The greatest number is " + num1);
			else
				System.out.println("The greatest number is " + num3);
		} else {
			if (num2 > num3)
				System.out.println("The greatest number is " + num2);
			else
				System.out.println("The greatest number is " + num3);
		}

	}

}
