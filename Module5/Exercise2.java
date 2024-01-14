public class Exercise2 {
	public static void main(String[] args) {
		int[] numbers = { 10, 5, 20, 0, 40, 45, 50 };
		double average;
		int sum;

		sum = 0;
		System.out.print("The Array Numbers: \t ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%15d", numbers[i]);
			sum += numbers[i];
		}
		System.out.println();

		average = sum / (float) (numbers.length);
		System.out.printf("Average : %10.2f\n", average);

		System.out.print("The Distance Values: \t ");
		for (int i = 0; i < numbers.length; i++)
			System.out.printf("%15.2f", Math.abs(numbers[i] - average));

		System.out.println();
	}
}
