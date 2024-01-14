package Module2;

import java.util.Scanner;

public class Lab222 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		double x;
		double y;
		double z;

		x = scnr.nextDouble();
		y = scnr.nextDouble();
		z = scnr.nextDouble();

		System.out.print(Math.pow(x, z) + " "); // x**z
		System.out.print(Math.pow(x, Math.pow(y, z)) + " "); // x** (y**z)
		System.out.print(Math.abs(y) + " "); // |y|
		double so = x * y;
		double st = Math.pow(so, z);
		System.out.println(Math.sqrt(st)); // Sqrt( (x*y)**z )

		scnr.close();
	}

}
