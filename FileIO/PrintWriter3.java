import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class PrintWriter3 {
	public static void main(String[] args) throws FileNotFoundException {
		File fp = new File("text.txt");
		PrintWriter pw = new PrintWriter(fp);

		pw.println("add a line by PrintWriter 3");
		pw.close();

	}

}
