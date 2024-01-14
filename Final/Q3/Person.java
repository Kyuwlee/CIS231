public abstract class Person {
	protected String name;
	protected String DOB;

	Person(String n, String d) {
		name = n;
		DOB = d;
	}

	abstract void printPerson();

	public String toString() {
		return "Name: \t" + name + "\tDOB:\t" + DOB + "\t";
	}

}
