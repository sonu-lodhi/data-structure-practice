package basicprogram.programs;

import java.util.Scanner;

public class StringPro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence : ");
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 1; i <= n ; i++) {
            if(n%i==0){
                System.out.print(str.charAt(i-1));
            }
        }

    }
}
