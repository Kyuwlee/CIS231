package Module7;

class Myclass {
	static Integer s1 = 0;

	static void add10() {
		s1 += 10;
	}

	static int getS1() {
		return s1;
	}
}

public class static_var1 {
	public static void main(String[] args) {

		Myclass.add10();
		System.out.println(Myclass.getS1());
		System.out.println(Myclass.s1);
		Myclass.add10();
		System.out.println(Myclass.getS1());

	}

}
