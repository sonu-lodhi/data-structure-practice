//Java Program to check Even or Odd number

package basicprogram;

import java.util.Scanner;

public class JavaProgramEvenOddNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number : ");
            int num = sc.nextInt();

            if (num % 2 == 0){
                System.out.println("The number "+num+" is even");
            }else {
                System.out.println("The number "+num+" is odd");
            }

        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
