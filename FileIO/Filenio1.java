import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;

public class Filenio1 {
	public static void main(String[] args) throws IOException {
		Path fpath = Paths.get("filenio.txt");
		if (Files.notExists(fpath))
			Files.createFile(fpath);

		Files.writeString(fpath, "Write a line through file.nio.file.Files");
		Files.write(fpath, "Add one more lien".getBytes());

		int num = 100;

		Files.writeString(fpath, num + "");

		byte[] buf = ByteBuffer.allocate(4).putInt(100).array();

		Files.write(fpath, buf, StandardOpenOption.WRITE);
		System.out.println("Buf " + buf.toString());

	}

}
