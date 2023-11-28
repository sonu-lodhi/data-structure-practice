package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSorting {
    public static int searching(int []array, int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return i;
            }
        }
     return -1;
    }
    public static void main(String[] args) {

        int []arr = {10, 2, 3, 11, 5, 6, 7, 6, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }

        Arrays.sort(arr);
        System.out.println();


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your target : ");
        int key = sc.nextInt();

        int indexSearch = searching(arr, key);

        if(indexSearch < 0){
            System.out.println("Element not found");
        }if(indexSearch>=0) {
            System.out.println("Element is found and is at index : " + indexSearch);
        }
    }
}
