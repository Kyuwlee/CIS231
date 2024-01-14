import java.util.Scanner;

public class Lab424 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInput, sum, cnt;
		cnt = 0;
		sum = 0;

		while (true) {
			userInput = scnr.nextInt();
			if (sum + userInput > 100)
				break;
			sum += userInput;
			cnt++;
		}
		System.out.printf("%d\t%d\n", sum, cnt);
		scnr.close();
	}

}
