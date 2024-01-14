import java.io.FileReader;

public class FileReader1 {
	public static void main(String[] args) throws java.lang.Exception {

		char[] buffer = new char[1024];
		FileReader rdfile = new FileReader("textin.txt");
		rdfile.read(buffer, 0, 1024);
		System.out.printf("%s%n", new String(buffer));
		System.out.println(buffer);

		rdfile.close();
	}

}
