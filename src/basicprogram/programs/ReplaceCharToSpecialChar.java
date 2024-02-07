package basicprogram.programs;

import java.util.Scanner;

public class ReplaceCharToSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence : ");
        String str = sc.nextLine();
        System.out.println("Enter any character : ");
        char ch1 = sc.nextLine().charAt(0);
        System.out.println("Enter any Special Character : ");
        char ch2 = sc.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char ch3 = str.charAt(i);
            if(ch3 == ch1){
                System.out.print(ch2);
            }else {
                System.out.print(ch3);
            }
        }

    }
}
