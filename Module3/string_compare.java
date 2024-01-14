package Module3;

public class string_compare {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "C++ Programming";

		if (str1 == str2)
			System.out.println("Two strings are same");
		else
			System.out.println("Two strings are distinct");

		if (str1.compareTo(str2) == 0) {
			System.out.println("Two strings are same");
		}
		String substr1 = str1.substring(5);
		String substr2 = str2.substring(4);
		if (substr1.compareTo(substr2) == 0) {
			System.out.println("Two strings are same");
		}
	}

}
