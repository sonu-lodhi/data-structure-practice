//Java Program to Add two Numbers

package basicprogram;

import java.util.Scanner;

public class AddToNums {
    public static void main(String[] args) {
        int num1, num2, sum;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter First Number : ");
            num1 = sc.nextInt();
            System.out.print("Enter Second Number : ");
            num2 = sc.nextInt();

            sum = num1+num2;
            System.out.print("Sum of these Numbers : "+sum);

        }catch (Exception e){
            System.out.println("Something went wrong.");
        }
    }
}
