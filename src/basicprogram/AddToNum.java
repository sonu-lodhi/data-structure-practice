package basicprogram;

import java.math.BigInteger;
import java.util.Scanner;

//How to add two Large Number
public class AddToNum {
    public static void main(String[] args) {
        String num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first large number : ");
        num1 = sc.nextLine();
        System.out.println("Enter second large number : ");
        num2 = sc.nextLine();

        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);
        BigInteger sum;

        sum = first.add(second);
        System.out.println("Result of Addition : "+sum);

    }

}
