package Module7;

class Students {
	String sname;
	int id;

	Students(String name, int num) {
		sname = name;
		id = num;
	}

	Students(String name) {
		sname = name;
		id = 0;
	}

	void setSname(String name) {
		sname = name;
	}

	void setID(int no) {
		id = no;
	}

	String getSname() {
		return sname;
	}

	int getID() {
		return id;
	}
}

public class class_student {

	public static void main(String[] args) {
		// Students s2 = new Students();
		Students s = new Students("John", 30);

		System.out.println(s.sname);
		System.out.println(s.getSname());
		System.out.println(s.getID());
	}

}
