import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraytest {
	public static void main(String[] args) {

		// ! 1. toString
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < 5; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		String strnum = Arrays.toString(numbers);
		System.out.println(strnum);

		// ! 2. Convert Array to ArrayList by using Array.asList()
		// Arrays.List( )

		String[] courseName1 = { "Java Programming" };
		// Now, courseName2 is a Arraylist that has the same elements as courseName1
		ArrayList<String> courseName2 = new ArrayList<String>(Arrays.asList(courseName1));

		System.out.println(courseName2);

		// ! 3. Create a List with Arrays.asList( )
		// List listnumbers = Arrays.asList(numbers);
		// System.out.println(listnumbers);

		List<Integer> l1 = Arrays.asList();
		System.out.println(l1);

		// ArrayList
		ArrayList<Integer> myArrayList1 = new ArrayList<Integer>();
		System.out.println("Array List from new ArrayList: Empty Array List " + myArrayList1);

		ArrayList<Integer> myArrayList2 = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
		System.out.println("Array List Value with Arrays.asList() " + myArrayList2);
		for (int i = 0; i < myArrayList2.size(); i++) {
			System.out.print(myArrayList2.get(i) + "\t");
		}
		System.out.println();

		// List
		List<Integer> myList1 = new ArrayList<Integer>(Arrays.asList(40, 50, 60));
		System.out.println("List Value form ArrayList(Arrays) " + myList1);

		List<Integer> myList2 = Arrays.asList(40, 50, 60);
		System.out.println("List Value from Array.asList() " + myList2);

		Integer[] numbers2 = { 1, 2, 3, 4, 5 };
		List<Integer> myList3 = Arrays.asList(numbers2);
		System.out.println("myList3: List from Integer arrays through Arrays.asList() " + myList3);

		// Difference between List and ArrayList
		// ? List:
		// ? Interface is implemented by the classes of ArrayList, LinkedList, Vector
		// and Stack

		// Foreach methods
		// Since Java 8, List inherits a default "forEach" method
		// which you can combine with the method reference "System.out::println" like
		// this:
		for (int i = 0; i < myList3.size(); i++) {
			System.out.print(myList3.get(i) + " ");
		}
		System.out.println("\nUsing forEach method to print out all elements");
		myList3.forEach(System.out::print);

		System.out.println();

		// ! 4. Contains()

		// List.contains()
		if (myList2.contains(40))
			System.out.println("It has 40");
		// ArrayList.contains()
		if (myArrayList2.contains(20))
			System.out.println("It has 20");

		System.out.println(Arrays.toString(numbers2));

		if (Arrays.asList(numbers2).contains(2))
			System.out.println(" It has 2");
		else
			System.out.println(" There is no 2");

		Arrays.asList(numbers2).forEach(System.out::print);

	}
}
