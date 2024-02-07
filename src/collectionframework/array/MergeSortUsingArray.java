package collectionframework.array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of arr1: ");
        int size1 = input.nextInt();
        int []arr1 = new int[size1];
        int i = 0;
        while(i<size1){
            arr1[i] = input.nextInt();
            i++;
        }
        System.out.println("Enter the size of arr2: ");
        int size2 = input.nextInt();
        int []arr2 = new int[size2];
        int j = 0;
        while(j<size2){
            arr2[j] = input.nextInt();
            j++;
        }
        printArrays(arr1);
        printArrays(arr2);
        int[] result = mergeSortProblemSolve(arr1, arr2);
        System.out.println("After merging : ");
        System.out.println(Arrays.toString(result));
    }

    private static int[] mergeSortProblemSolve(int[] arr1, int[] arr2) {
        int []arr3 = new int[arr1.length+arr2.length];
        int i = 0;
        for (; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int j=0;
        for (; j<arr2.length; j++){
            arr3[arr1.length+j]=arr2[j];
        }
        sortingArrayElements(arr3);
        return arr3;
    }
    static void sortingArrayElements(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void printArrays(int[] arr){
        for (int element:arr) {
            System.out.print(element+", ");
        }
        System.out.println();
    }
}
