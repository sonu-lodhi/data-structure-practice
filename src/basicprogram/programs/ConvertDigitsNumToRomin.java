package basicprogram.programs;

import java.util.Scanner;

public class ConvertDigitsNumToRomin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();

        String []arr ={"zero","one", "two", "three", "four", "five", "six", "seven", "Eight", "nine"};
        int rem = 0;
        String str = "";
        while (num != 0){
            rem = num%10;
            str = arr[rem]+" "+str;
            num = num/10;
        }
        System.out.println(str);
    }
}
