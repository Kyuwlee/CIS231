public class Exercise51 {
	public static void main(String[] args) {
		int[] num1 = { 10, 5, 20, 0, 40, 45, 50 };
		// int[] num2 = { 20, 0, 40 };
		int[] num2 = { 40, 50 };
		int flag = 1;

		for (int i = 0; i < num1.length - num2.length + 1; i++) {
			flag = 1;
			for (int j = 0; j < num2.length; j++) {
				if (num1[i + j] != num2[j]) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.println("The num2 is a subset of num1 ");
				break;
			}
		}
		if (flag == 0) {
			System.out.println("The num2 is not a subset of num1 ");
		}
	}
}
