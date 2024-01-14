public class Exercise1 {
	public static void main(String[] args) {

		int[] numbers = { 10, 15, 30, 5, 35 };
		int min;

		min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i])
				min = numbers[i];
		}
		System.out.println("The min value is " + min);

	}

}
