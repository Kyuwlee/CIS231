package Module2;

import java.util.Random;

public class rdnum {
	public static void main(String[] args) {
		Random rdn = new Random();
		int num = rdn.nextInt();
		System.out.format("Random number is %d%n", num);
		num = rdn.nextInt();
		System.out.format("Random number is %d%n", num);
		num = rdn.nextInt();
		System.out.format("Random number is %d%n", num);

	}

}
