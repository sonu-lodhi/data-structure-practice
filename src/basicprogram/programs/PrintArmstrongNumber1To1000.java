package basicprogram.programs;

import java.util.Scanner;

public class PrintArmstrongNumber1To1000 {
    public static void main(String[] args) {

        for(int num =1; num<=1000; num++ ) {
            int a, i=0, j=0;
            a = num;
            while (a > 0) {
                i = a % 10;
                j = (i * i * i)+j;
                a = a / 10;
            }

            if (j == num) {
                System.out.println(num);
            }
        }
    }
}
