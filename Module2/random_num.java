package Module2;

import java.util.Random;

public class random_num {
	public static void main(String[] args) {

		int rdnum;
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		rdnum = random.nextInt();
		System.out.println(rdnum);

		rdnum = random.nextInt(0, 100);
		System.out.println(rdnum);
		rdnum = random.nextInt(50, 70);
		System.out.println(rdnum);

		Float fnum = (float) rdnum;
		System.out.printf("Type converted to flaot fnum %.2f\n", fnum);

		// Math.random
		// Math.random vs java.util.Random

		double randnum = Math.random();
		System.out.printf("Random number from Math.random = %f\n ", randnum);
	}

}
