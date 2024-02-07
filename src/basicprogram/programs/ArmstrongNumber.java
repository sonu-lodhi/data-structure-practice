package basicprogram.programs;

import java.util.Scanner;

//153 = 1^3+5^3+3^3 = 1+125+27 = 153 is a Armstrong.
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = sc.nextInt();

        if(isArmstrong(number)){
            System.out.println(number+" is a Armstrong Number.");
        }else {
            System.out.println("Not Armstrong.");
        }


    }

    private static boolean isArmstrong(int number) {
        int originalNumber, digits=0, last=0, sum=0;
        originalNumber = number;
        while (originalNumber>0){
            originalNumber = originalNumber/10;
            digits++;
        }
        originalNumber = number;

        while (originalNumber>0){
            last = originalNumber % 10;
            sum += (Math.pow(last, digits));
            originalNumber = originalNumber/10;
        }
        if(number == sum){
            return true;
        }else {
            return false;
        }
    }
}
