import java.util.Scanner;

public class Lab425 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String inputString = scnr.nextLine();

		int i, cnt;
		char max_char;
		i = 0;
		cnt = 0;
		max_char = ' ';

		inputString = inputString.toLowerCase();
		while (i < inputString.length()) {
			if (Character.isLetter(inputString.charAt(i))) {
				if (max_char < inputString.charAt(i))
					max_char = inputString.charAt(i);
				cnt++;
			}
			i++;
		}
		System.out.printf("%d\t%c\n", cnt, Character.toUpperCase(max_char));
		scnr.close();
	}

}
