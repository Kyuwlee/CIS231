import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int num = input.nextInt();
			String name = input.next();
			System.out.print("Number ");
			System.out.print(num);
			System.out.print("Name ");
			System.out.println(name);
		}
	}

}
