import java.util.Scanner;

public class input_validation2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char user;
		while (true) {
			user = scnr.next().charAt(0);
			if (user == 'q') {
				System.out.println("You entered q. The loop stopped");
				break;
			} else { // else can be eliminated.
				System.out.format("Your input is %c. Press 'q' to stop \n", user);
			}
		}
		scnr.close();
	}
}
