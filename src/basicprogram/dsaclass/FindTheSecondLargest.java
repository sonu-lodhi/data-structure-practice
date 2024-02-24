package basicprogram.dsaclass;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int []arr = new int[size];

        System.out.println("Enter the elements in the array : ");
        int len= arr.length;
        int i=0;
        while(i<len){
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("this is your array:");
        printArray(arr);

        System.out.println("This is second largest element in the given array : "+findTheSecondLargest(arr));

    }

    static void printArray(int []arr){
        int i =0;
        int len = arr.length;
        while(i< len){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }

    static int findTheSecondLargest(int []arr){
        int end = arr.length-1;
        Arrays.sort(arr);
        return arr[end-1];
    }
}
