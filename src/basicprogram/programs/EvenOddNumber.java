package basicprogram.programs;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any number : ");
        int num = sc.nextInt();
        int r = checkEvenOddNumber(num);

        if (r == 0) {
            System.out.println("This is even number.");
        }else {
            System.out.println("This is odd number.");
        }
    }
    static int checkEvenOddNumber(int num){
        return (num%2);
    }
}
