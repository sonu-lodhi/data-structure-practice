package basicprogram.programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : " );
        long num = sc.nextLong();
        long fact = 1; long a;
        System.out.print(num+"! = ");
        System.out.print(num+" x ");
        for (int i = 1; i<=num; i++){
            fact = fact*i;

            a=num;
            long j = a-i;
            if(j>=1) {
                System.out.print(j);
                if(j>=2){
                    System.out.print(" x ");
                }
            }
        }
        System.out.print(" = "+fact);
    }
}
