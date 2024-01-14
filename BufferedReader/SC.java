// package BufferedReader;

import java.io.*;
import java.util.Scanner;

public class SC {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        var con = System.console();

        Scanner sc = new Scanner(con.reader());

        con.writer().println("Enter the Sting value: ");
        String strval = sc.nextLine();

        con.writer().println("Enter the number ");
        int number = sc.nextInt();

        con.printf("%s %d\n", strval, number);

        sc.close();
    }

}
