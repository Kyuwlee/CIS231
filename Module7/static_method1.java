package Module7;

class Static_methods {

	static Integer x = 0;
	static Integer y = 0;

	static void printXY() {
		x = y = 100;
		System.out.println("static x is " + x);
		System.out.println("static y is " + y);
	}

}

public class static_method1 {
	public static void main(String[] args) {
		Static_methods.printXY();
	}

}
