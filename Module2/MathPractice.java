package Module2;

import java.util.Scanner;

public class MathPractice {
	public static void main(String[] args) {

		// Practice of Math Function
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html

		Scanner scanner = new Scanner(System.in);
		System.out.format("Enter two integer values for power numbers%n");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();

		// Power Number
		// x to the Power of y : pow(x,y)
		System.out.format("Power number %f = %d to the power number %d%n", Math.pow((double) n1, (double) n2),
				n1,
				n2);

		double d1 = 2.0;
		double d2 = 3.0;
		System.out.println(Math.pow(d1, d2));

		// Round, Floor and Ceil

		d1 = 2.5;
		System.out.printf(" Round of %.2f = %d%n", d1, Math.round(d1));
		System.out.printf(" Floor of %f = %.2f%n", d1, Math.floor(d1));
		System.out.printf(" Ciel of %f = %.2f%n", d1, Math.ceil(d1));

		// Math.random vs java.util.Random

		double rdnum = Math.random();
		System.out.printf(" Random number from Math.random = %f%n ", rdnum);
		int converted_num = (int) (rdnum * 1.0E06) % 100;
		System.out.printf(" Random number between 0 and 99 = %d%n ", converted_num);

		// Min and Max
		double min = Math.min(d1, d2);
		System.out.printf("The min value of %f and %f is %f%n", d1, d2, min);

		int max = Math.max(n1, n2);
		System.out.printf("The max value of %d and %d is %d\n", n1, n2, max);

		scanner.close();
	}

}
