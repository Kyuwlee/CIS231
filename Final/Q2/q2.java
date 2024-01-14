import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class q2 {
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

	public static void printNumbers(ArrayList<Integer> numbers) {
		for (Integer v : numbers) {
			System.out.print(v);
			System.out.print("\t");
		}
		System.out.println();
	}

	public static void findSubsequence(ArrayList<Integer> numbers) {
		Integer max, idx;
		max = 0;
		idx = 0;
		for (int i = 1; i < numbers.size() - 1; i++) {
			Integer tmp = getSum(numbers, i);
			if (max < tmp) {
				max = tmp;
				idx = i;
			}
		}
		String prtstr = "";
		for (int i = idx - 1; i < idx + 2; i++)
			prtstr += Integer.toString(numbers.get(i)) + "\t";
		System.out.println(prtstr);
	}

	public static Integer getSum(ArrayList<Integer> numbers, Integer idx) {
		Integer sum = 0;

		for (int i = idx - 1; i < idx + 2; i++)
			sum += numbers.get(i);
		return sum;
	}

	public static void main(String[] args) {
		int n = getInput();
		ArrayList<Integer> numbers = fillupArray(n);
		printNumbers(numbers);
		findSubsequence(numbers);
	}

}
