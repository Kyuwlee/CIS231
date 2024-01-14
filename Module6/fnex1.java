package Module6;

public class fnex1 {

	public static int isGreater(int n1, int n2) {
		int result;
		if (n1 > n2)
			result = 1;
		else
			result = 0;
		return result;
	}

	public static void main(String[] args) {
		int num1, num2;

		num1 = 10;
		num2 = 20;
		int res = isGreater(num1, num2);
		System.out.println(res);

	}
}
