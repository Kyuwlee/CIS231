package Module7;

class Outer {

	Integer x = 0;
	Integer y = 0;

	class Inner {

		void printXY() {
			x = y = 100;
			System.out.println("Outer x is " + x);
			System.out.println("Outer x is " + y);
		}
	}

}

public class static_class1 {
	public static void main(String[] args) {

		Outer out = new Outer();
		Outer.Inner in = out.new Inner();

		Outer.Inner in2 = new Outer().new Inner();

		in.printXY();
		in2.printXY();

	}

}
