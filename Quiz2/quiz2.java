package Quiz2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quiz2 {
	public static int[] constructArray(Scanner scnr) {

		System.out.print("Enter a number for the size of array: ");
		int Size = scnr.nextInt();
		int[] array = new int[Size];

		Random rdnum = new Random();
		rdnum.setSeed(System.currentTimeMillis());

		for (int i = 0; i < Size; i++) {
			array[i] = rdnum.nextInt(100);
		}
		return array;

	}

	public static void printArray(int[] n) {
		System.out.println(Arrays.toString(n));
	}

	public static int findMoreEvens(int[] n1, int[] n2) {
		int even1, even2;
		even1 = even2 = 0;
		for (int i = 0; i < n1.length; i++) {
			if (n1[i] % 2 == 0)
				even1++;
		}
		for (int i = 0; i < n2.length; i++) {
			if (n2[i] % 2 == 0)
				even2++;
		}
		if (even1 > even2)
			return 1;
		else
			return 2;

	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void swapMax(int[] arr) {
		int idx = 0;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		int tmp = arr[idx];
		arr[idx] = arr[arr.length - 1];
		arr[arr.length - 1] = tmp;

	}

	public static int findGreatest(int[] n1, int[] n2) {
		int max1, max2;
		max1 = getMax(n1);
		max2 = getMax(n2);

		if (max1 > max2) {
			swapMax(n1);
			return 1;
		} else {
			swapMax(n2);
			return 2;
		}

	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] array1, array2;

		array1 = constructArray(scnr);
		array2 = constructArray(scnr);

		printArray(array1);
		printArray(array2);

		int result = findMoreEvens(array1, array2);
		System.out.println("The array " + result + " has move even numbers");

		result = findGreatest(array1, array2);
		if (result == 1)
			System.out.println(
					"The array " + result + " has the greatest value " + array1[array1.length - 1]);
		else
			System.out.println(
					"The array " + result + " has the greatest value " + array2[array2.length - 1]);

		scnr.close();
	}
}
