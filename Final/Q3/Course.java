public class Course implements CourseActivity {

	String cid;
	String coursename;
	Integer score;
	String grade;

	Course(String id, String name, Integer sc) {
		cid = id;
		coursename = name;
		score = sc;
	}

	public String toString() {
		String prtstr;
		prtstr = "Course ID\t" + cid + "\tName: " + coursename + "\tScore:\t" + score + "\tGrade\t" + grade
				+ "\n";
		return prtstr;
	}

	public void decideGrade() {
		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "A";
		else if (score >= 70)
			grade = "B";
		else if (score >= 60)
			grade = "C";
		else if (score >= 50)
			grade = "D";
		else
			grade = "F";
	}

	public void printCourseinfo() {
		System.out.println("Course ID\t" + cid + "\tName: " + coursename + "\n");
	}

}
