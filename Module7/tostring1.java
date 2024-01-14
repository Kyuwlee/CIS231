package Module7;

class Student_2 {
	Integer sid;
	String sname;

	public String toString() {
		String str = "Name: " + Integer.toString(sid) + " ID: " + sname;
		return str;
	}
}

public class tostring1 {
	public static void main(String[] args) {
		Student_2 s = new Student_2();
		s.sid = 10001;
		s.sname = "Bill Smith";
		System.out.println(s);
	}
}
