import java.util.Scanner;

public class while_ex3 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter the any character. To stop this, press 'q' ");
		char c;
		while ((c = scnr.next().charAt(0)) != 'q') {
			System.out.format("You entered %c%n", c);
		}
		System.out.println("The while loop is terminated");
		scnr.close();
	}
}
