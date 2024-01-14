public class Exercise52 {
	public static void main(String[] args) {
		int[] num1 = { 10, 5, 20, 0, 40, 45, 50 };
		int[] num2 = { 20, 0, 40 };
		int flag = 0;
		int j = 0;

		for (int i = 0; i < num1.length; i++) {
			if (num1[i] == num2[j]) {
				j += 1;
				if (j == num2.length) {
					flag = 1;
					break;
				}
			} else
				j = 0;
		}
		if (flag == 1)
			System.out.println("The num2 is a subset of num1 ");

	}

}
