package basicprogram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static int linearSearch(int arr[], int key){
        System.out.println("Before sorting "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorting "+ Arrays.toString(arr));
        int result =0;
        int arrSize = arr.length;
        if(arrSize == 0){
            return result;

        }
        for (int i = 0; i <arrSize; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n =10;
        int arr[] = new int[n];
        arr[0] = 15;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        arr[6] = 60;
        arr[7] = 90;
        arr[8] = 80;
        arr[9] = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any primary key : ");
        int key = sc.nextInt();
        System.out.println("Element present at index "+linearSearch(arr, key));
    }



}
