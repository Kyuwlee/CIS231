class Person {
	protected String name;
	protected String dob;

	Person(String n, String d) {
		name = n;
		dob = d;
	}
}

class Student extends Person {
	Integer sid;
	Integer credits;

	Student(String n, String d, Integer id, Integer cr) {
		super(n, d);
		sid = id;
		credits = cr;
	}

	void printStudent() {
		System.out.println(name);
		System.out.println(dob);
		System.out.println(Integer.toString(sid));
		System.out.println(Integer.toString(credits));
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Student p1 = new Student("Kim", "Dec/31/2022", 1001, 30);
		p1.printStudent();
	}

}
