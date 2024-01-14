package Module7;

public class static_method2 {
	static Integer x = 0;
	static Integer y = 0;

	static void printXY() {
		x = y = 100;
		System.out.println("static x is " + x);
		System.out.println("static y is " + y);
	}

	static void printMSG(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		String msg = "print message";

		printXY();
		printMSG(msg);
	}

}
