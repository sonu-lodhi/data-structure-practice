package basicprogram.programs;

import java.util.Scanner;

public class FindTheSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any value : ");
        int num = sc.nextInt();
        int a,i=0,sum=0;
        a=num;
        while(a>0){
            i = a%10;
            sum = sum+i;
            a = a/10;
        }
        System.out.println("Digits of Sum is : "+sum);
    }
}
