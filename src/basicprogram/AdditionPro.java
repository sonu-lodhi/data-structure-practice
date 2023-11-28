package basicprogram;

import java.util.Scanner;

public class AdditionPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.print("result of sum : "+sum);

    }
}
