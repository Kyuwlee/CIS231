import java.io.*;

public class BR {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strval = br.readLine();

        int number = Integer.parseInt(br.readLine());

        System.out.println("The read value for string: " + strval);
        System.out.println("The read value for integer : " + number);

    }
}