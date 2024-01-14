import java.util.ArrayList;

public class Student {

	Integer sid;
	String sname;
	ArrayList<Course> clist;

	Student(Integer id, String name, ArrayList<Course> c) {
		sid = id;
		sname = name;
		clist = c;
	}

	public String toString() {
		String str;
		str = "Student: " + Integer.toString(sid) + "\t" + sname + "\n";
		for (int i = 0; i < clist.size(); i++)
			str += "\t" + clist.get(i);
		return str;
	}

	public Integer getTotalCredits() {
		Integer total = 0;
		for (int i = 0; i < clist.size(); i++) {
			total += clist.get(i).credit;
		}
		return total;
	}
}
