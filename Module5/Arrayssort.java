import java.util.Arrays;

public class Arrayssort {
	public static void main(String[] args) {
		int[] numbers = { 10, 5, 20, 0, 40, 45, 50 };

		Arrays.sort(numbers);
		for (int v : numbers)
			System.out.print(v + "\t");
		System.out.println();
	}
}
