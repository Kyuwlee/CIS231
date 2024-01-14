import java.util.Scanner;

public class continue_ex {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char c;

		while (true) {
			System.out.print("To stop, press 'q' ");
			c = scnr.next().charAt(0);
			if (c != 'q') {
				System.out.println("Input character is " + c);
				continue;
			}
			break;
		}
		scnr.close();
	}

}
