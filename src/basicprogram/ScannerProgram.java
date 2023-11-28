package basicprogram;

import java.util.Scanner;

//How to get input using scanner
public class ScannerProgram {
    public static void main(String[] args) {
        int a;
        float b;
        String s;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        s = sc.nextLine();
        System.out.println("You entered string "+s);

        System.out.println("Enter a number : ");
        a = sc.nextInt();
        System.out.println("You entered number "+a);

        System.out.println("Enter a decimal number : ");
        b = sc.nextFloat();
        System.out.println("You entered decimal number "+b);



    }
}
