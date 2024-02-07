package basicprogram.programs;

import java.util.Scanner;

public class CalculateLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the secound number : ");
        int num2 = sc.nextInt();

        int lcm = calOfLCM(num1, num2);

        System.out.println("LCM of "+num1+" and "+num2+" is : "+lcm);

        sc.close();
    }
    public static int calOfLCM(int num1, int num2){

        if (num1 == 0 || num2 == 0) {
            return 0;
        }else {
            return Math.abs(num1 * num2) / calculateGDC(num1, num2);
        }
        }

    public static int calculateGDC(int num1, int num2){
        while (num2 != 0){
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;
    }
}
