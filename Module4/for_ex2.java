import java.util.Scanner;

public class for_ex2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int n = scnr.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.format("%,.0f\t", Math.pow((double) n, (double) i));
		}
		System.out.println();
		scnr.close();
	}

}
