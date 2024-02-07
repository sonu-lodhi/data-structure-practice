package datastructure.searching;

import java.util.Scanner;

public class SelectionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : " );
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("After Adding elements in the array");
        printArray(arr);

        selectionSort(arr);
        System.out.println("After Sorting Array...... using selection sort");
        printArray(arr);
    }

    private  static  void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int index = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
