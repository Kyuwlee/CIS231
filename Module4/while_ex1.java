public class while_ex1 {
	public static void main(String[] args) {
		int i = 0;
		final int N = 10;
		while (i < N) {
			System.out.print(i + "\t");
			i += 1;
		}
		System.out.format("\n Loop terminated. The value of i is %d%n", i);
	}

}
