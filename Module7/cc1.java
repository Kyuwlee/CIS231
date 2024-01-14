package Module7;

class MyClass_c {
	Integer x = 0;
	Integer y = 0;

	MyClass_c(Integer param1, Integer param2) {
		x = param1;
		y = param2;
	}

	MyClass_c(MyClass_c copyobj) {
		this.x = copyobj.x;
		this.y = copyobj.y;
	}

}

public class cc1 {
	public static void main(String[] args) {
		MyClass_c obj1 = new MyClass_c(10, 10);
		System.out.println("Object 1 value:  " + obj1.x + " " + obj1.y);

		MyClass_c obj2 = obj1; // Call Copy Constructor. Obj1 instance will be copied to obj2.
		System.out.println("Object 2 value:  " + obj2.x + " " + obj2.y);

		MyClass_c obj3 = new MyClass_c(obj1); // Call Copy Constructor. Obj1 instance will be copied to obj3.
		System.out.println("Object 3 value:  " + obj3.x + " " + obj3.y);
	}

}
