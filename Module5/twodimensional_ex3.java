public class twodimensional_ex3 {
	public static void main(String[] args) {
		String[] names = { "Java", "Python", "C++", "R", "Php" };

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.printf("\n");
		System.out.println("The string that contains 'p' ");
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("P"))
				System.out.println(names[i]);
		}

	}

}
