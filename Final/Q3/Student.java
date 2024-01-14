import java.util.ArrayList;

public class Student extends Person {

	Integer sid;
	Integer credits;
	ArrayList<Course> clist;

	Student(String name, String date, Integer id, Integer cr, ArrayList<Course> cl) {
		super(name, date);
		sid = id;
		credits = cr;
		clist = cl;
	}

	public String toString() {
		String prtstr;
		prtstr = super.toString() + "\n";
		prtstr += "ID:\t" + sid + "\tCredits:\t" + credits + "\n";
		for (int i = 0; i < clist.size(); i++) {
			prtstr += clist.get(i).toString();
		}
		return prtstr;
	}

	public void printPerson() {
		System.out.println("Name: \t" + name + "ID\t" + sid + "DOB\t" + DOB);
	}
}
