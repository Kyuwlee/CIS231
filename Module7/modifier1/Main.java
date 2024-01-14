import Students.*;

public class Main {
	public static void main(String[] args) {
		Students s = new Students("John", 20); // Error. Because the Class Students constructor declared as
							// "default" Even the Student is "public".
		System.out.println(s.sname);
		System.out.println(s.id);
	}

}
