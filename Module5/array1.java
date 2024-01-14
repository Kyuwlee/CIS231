import java.util.Random;

public class array1 {
	public static void main(String[] args) {

		Random rd = new Random();

		rd.setSeed(System.currentTimeMillis());
		final int N = 10;
		int[] numbers = new int[N];

		for (int i = 0; i < N; i++) {
			numbers[i] = rd.nextInt(101);
		}

		for (int v : numbers)
			System.out.print(v + "\t");
		System.out.println();
	}

}
