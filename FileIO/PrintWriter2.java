import java.io.*;

public class PrintWriter2 {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("file2.txt");
			pw.println("Add a line 1");
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
