import java.util.Arrays;

public class Arraysfill {
	public static void main(String[] args) {
		final int N = 10;
		int[] numbers = new int[N];

		Arrays.fill(numbers, 0);

		for (int v : numbers)
			System.out.print(v + "\t");
		System.out.println();

	}

}
