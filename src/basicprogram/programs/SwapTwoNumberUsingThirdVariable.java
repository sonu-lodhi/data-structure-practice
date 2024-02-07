package basicprogram.programs;

import java.util.Scanner;

public class SwapTwoNumberUsingThirdVariable {
    public static void main(String[] args) {
        int num1, num2, swap;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        num2 = sc.nextInt();

        System.out.println("Before Swapping number is : "+ num1 +" & "+num2);

        swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.println("After Swapping Number is : "+num1+" & "+num2);

    }
}
