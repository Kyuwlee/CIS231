import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Quiz4 {
	public static ArrayList<Student> fillupStudent() throws FileNotFoundException {

		ArrayList<Student> slist = new ArrayList<Student>();
		Integer sid, credit, coursenum;
		String cid, sname, cname, grade;

		File fp = new File("studentinfo.txt");
		Scanner sc = new Scanner(fp);

		while (sc.hasNextLine()) {
			sid = sc.nextInt();
			sname = sc.next();
			coursenum = sc.nextInt();
			ArrayList<Course> cl = new ArrayList<Course>();
			for (int i = 0; i < coursenum; i++) {
				cid = sc.next();
				cname = sc.next();
				credit = sc.nextInt();
				grade = sc.next();
				Course c = new Course(cid, cname, credit, grade);
				cl.add(c);
			}
			Student s = new Student(sid, sname, cl);
			slist.add(s);
		}
		sc.close();
		return slist;
	}

	public static void printStudent(ArrayList<Student> slist) {
		for (int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i));
			System.out.println("Total Credits " + Integer.toString(slist.get(i).getTotalCredits()));
		}
	}

	public static void printStudent(ArrayList<Student> slist, Integer id) {
		for (int i = 0; i < slist.size(); i++) {
			if (slist.get(i).sid == id) {
				System.out.println(slist.get(i));
				System.out.println("Total Credits " + Integer.toString(slist.get(i).getTotalCredits()));
			}
		}
	}

	public static Integer findStudent(ArrayList<Student> slist) {
		Integer maxcredit = 0;
		Integer id = 0;

		for (int i = 0; i < slist.size(); i++) {
			if (maxcredit < slist.get(i).getTotalCredits()) {
				maxcredit = slist.get(i).getTotalCredits();
				id = slist.get(i).sid;
			}
		}
		return id;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Integer sid;

		ArrayList<Student> slist;

		slist = fillupStudent();
		printStudent(slist);
		sid = findStudent(slist);
		System.out.println("The student who has the greatest credits: ");
		printStudent(slist, sid);

	}

}
