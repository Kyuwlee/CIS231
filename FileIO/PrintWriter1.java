import java.io.*;

public class PrintWriter1 {
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "text.txt";
		PrintWriter pw = new PrintWriter(filename);

		pw.println("Add a line");
		pw.close();

	}

}
