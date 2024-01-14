package Module7;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	final int N = 3;
	Integer sid;
	String sname;
	int[] scores = new int[N];

	Student(Integer id, String name) {
		sid = id;
		sname = name;
	}

	Student(Integer id, String name, int[] sc) {
		sid = id;
		sname = name;
		for (int i = 0; i < N; i++) {
			scores[i] = sc[i];
		}
	}

	Integer getSid() {
		return sid;
	}

	String getSname() {
		return sname;
	}

	public String toString() {
		String prt;
		prt = "Student ID: " + Integer.toString(sid) + " Name: " + sname + "\n";
		for (int i = 0; i < N; i++) {
			prt += scores[i] + "\t";
		}
		prt += "\n";
		return prt;
	}
}

public class arrlist1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int SIZE = 3;
		ArrayList<Student> students = new ArrayList<Student>(SIZE);

		for (int i = 0; i < SIZE; i++) {
			System.out.println("Enter student's name: ");
			String name = scnr.next();
			Student s = new Student(i, name);
			System.out.println("Enter student's 3 scores: ");
			for (int j = 0; j < s.N; j++) {
				s.scores[j] = scnr.nextInt();
			}

			students.add(s);
		}
		for (int i = 0; i < SIZE; i++) {
			System.out.println(students.get(i));
		}

		scnr.close();

	}

}
