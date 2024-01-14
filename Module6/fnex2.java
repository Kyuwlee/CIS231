package Module6;

import java.util.Arrays;

public class fnex2 {

	public static void changeMe(int n1, int n2) {
		n1 = 1000;
		n2 = 2000;
		System.out.println(n1 + " " + n2); // 1000 2000
	}

	public static int[] changeArray(int[] num) {

		int[] functionarray = { 0, 1, 2 };

		num[0] = 1000;
		num[3] = 2000;
		num[num.length - 1] = 5000;
		return functionarray;
	}

	public static void main(String[] args) {
		int num1, num2;
		int[] numbers = { 0, 1, 2, 3, 4, 5 };
		int[] result;

		num1 = 10;
		num2 = 20;
		changeMe(num1, num2);
		System.out.println(num1 + " " + num2); // 10 20

		result = changeArray(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(result));

	}
}
