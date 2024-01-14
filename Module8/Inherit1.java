class Person {
	String name;
	String dob;

	Person(String n, String d) {
		name = n;
		dob = d;
	}

	public String toString() {
		return "Name\t" + name + "\tDOB\t" + dob + "\t";
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

	public String toString() {
		String str = "Student " + super.toString();
		str += "ID " + Integer.toString(sid) + "\tCredits\t" + Integer.toString(credits);
		return str;
	}
}

public class Inherit1 {

	public static void main(String[] args) {

		Person p1 = new Person("John", "Jan/01/2000");

		System.out.println(p1);

		Student p2 = new Student("Kim", "Dec/31/2022", 1001, 30);
		System.out.println(p2);
	}

}
