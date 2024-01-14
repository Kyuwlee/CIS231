import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class q3 {
	public static ArrayList<Student> fillupStudent() throws FileNotFoundException {

		ArrayList<Student> slist = new ArrayList<Student>();
		Integer sid, credits, coursenum;
		String cid, sname, cname, date;
		Integer score;

		File fp = new File("student.txt");
		Scanner sc = new Scanner(fp);

		while (sc.hasNextLine()) {
			sid = sc.nextInt();
			sname = sc.next();
			credits = sc.nextInt();
			date = sc.next();
			coursenum = sc.nextInt();
			ArrayList<Course> cl = new ArrayList<Course>();
			for (int i = 0; i < coursenum; i++) {
				cid = sc.next();
				cname = sc.next();
				score = sc.nextInt();
				Course c = new Course(cid, cname, score);
				c.decideGrade();
				cl.add(c);
			}
			Student s = new Student(sname, date, sid, credits, cl);
			
			slist.add(s);
		}
		sc.close();
		return slist;
	}

	public static void printStudent(ArrayList<Student> slist) {
		for (int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i));
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Student> slist;

		slist = fillupStudent();
		printStudent(slist);
	}

}
