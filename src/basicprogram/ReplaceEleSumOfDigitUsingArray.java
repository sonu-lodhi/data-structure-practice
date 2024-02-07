package basicprogram;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceEleSumOfDigitUsingArray {

    static void replaceEleSumOfDigitUsingArray(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            int n = arr[i];
            int sum = 0;
            while(n>0){
                sum = sum + n%10;
                n = n/10;
            }
            arr[i] = sum;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        replaceEleSumOfDigitUsingArray(arr);
    }
}
