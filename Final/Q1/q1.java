import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class q1 {
	public static ArrayList<Integer> fillupArray(Integer n) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(n);
		Random rd = new Random();
		rd.setSeed(System.currentTimeMillis());
		for (int i = 0; i < n; i++) {
			numbers.add(rd.nextInt(100));
		}
		return numbers;
	}

	public static Integer getInput() {
		Scanner scnr = new Scanner(System.in);
		Integer n = scnr.nextInt();
		scnr.close();
		return n;
	}

	public static Integer findMedian(ArrayList<Integer> numbers) {
		Integer med;
		Collections.sort(numbers);
		// Arrays.sort(numbers.toArray();
		med = numbers.get(numbers.size() / 2);
		return med;
	}

	public static void printNumbers(ArrayList<Integer> numbers) {
		for (Integer v : numbers) {
			System.out.print(v);
			System.out.print("\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int n = getInput();
		ArrayList<Integer> numbers = fillupArray(n);
		printNumbers(numbers);
		System.out.println(findMedian(numbers));
	}
}