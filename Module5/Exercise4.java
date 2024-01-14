public class Exercise4 {
	public static void main(String[] args) {
		int idx;
		int[] num1 = { 10, 5, 20, 0, 40, 45, 50 };
		int[] num2 = { 10, 5, 20, 45, 40, 50, 0 };

		int iter_num = (num1.length < num2.length) ? num1.length : num2.length;
		for (idx = 0; idx < iter_num; idx++) {
			if (num1[idx] != num2[idx])
				break;
		}

		for (int i = 0; i < idx; i++)
			System.out.print(num2[i] + "\t");
		System.out.println();
	}

}
