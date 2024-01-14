import java.io.FileWriter;

public class FileWriter1 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("text.txt");
			fw.write("Add line 1 by FileWriter1");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}