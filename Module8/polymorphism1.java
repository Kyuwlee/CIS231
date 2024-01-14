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

	void printName() {
		System.out.println("Class person " + name);
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

	void printName() {
		System.out.println("Class Student\t " + name + " SID " + sid);
	}
}

public class polymorphism1 {
	public static void main(String[] args) {
		Person p;

		p = new Student("John", "May/01/2022", 1001, 10);
		p.printName();
	}

}
