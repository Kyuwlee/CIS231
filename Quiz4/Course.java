public class Course {

	String cid;
	String cname;
	Integer credit;
	String grade;

	Course(String id, String name, Integer c, String g) {
		cid = id;
		cname = name;
		credit = c;
		grade = g;
	}

	public String toString() {
		return "Course: " + cid + "\t" + cname + "\t" + Integer.toString(credit) + "\t"
				+ grade + "\n";
	}

}
