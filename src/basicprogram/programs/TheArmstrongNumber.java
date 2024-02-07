package basicprogram.programs;

import java.util.Scanner;

public class TheArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        long num = sc.nextLong();

        long a, i=0,j=0;
        a=num;
        while(a>0){
            i = a%10;
            j= (i*i*i)+j;
            a= a/10;
        }
        if (j == num) {
            System.out.println("It is Armstrong Number");
        }else {
            System.out.println("It is not Armstrong number");
        }
    }
}
