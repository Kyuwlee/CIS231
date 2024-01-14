import javax.lang.model.util.ElementScanner14;

public class Exercise3 {
	public static void main(String[] args) {
		int flag = 0;
		int[] num1 = { 10, 5, 20, 0, 40, 45, 50 };
		int[] num2 = { 40, 10, 5 };

		for (int i = 0; i < num2.length; i++) {
			flag = 0;
			for (int j = 0; j < num1.length; j++) {
				if (num2[i] == num1[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				break;
		}
		if (flag == 1)
			System.out.println("The array num2 is a subset of num1");
		else
			System.out.println("The array num2 is NOT a subset of num1");
	}

}
