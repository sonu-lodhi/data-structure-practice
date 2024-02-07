package basicprogram.programs;

import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any number : ");
        int num = sc.nextInt();

        int a, i=0, j=0;
        a=num;
        while(a>0){
            i = a%10;
            j = (j*10)+i;
            a = a/10;
        }
        if (j == num) {
            System.out.println("It is Palindrome number");
        }else {
            System.out.println("It is Not palindrome number");
        }
    }
}
