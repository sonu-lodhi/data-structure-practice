package basicprogram.filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class JavaMainClass {
    public static void main(String[] args) throws IOException {
        //int n = System.in.read();
        //System.out.println(n);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter anything else: ");
//        int n = br.read();
//        System.out.println(n);
        System.out.println("Enter the string : ");
        String s = br.readLine();
        System.out.println(s);
        System.out.println("Enter the number: ");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println(n1);
    }
}
