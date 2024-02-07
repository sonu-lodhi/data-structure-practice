package basicprogram.patterns;

import java.util.Arrays;
import java.util.Scanner;

public class MergedTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of First Array : ");
        int sizeOfFirstArr = sc.nextInt();
        int []arr1 = new int[sizeOfFirstArr];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < sizeOfFirstArr; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of Second Array : ");
        int sizeOfSecondArray = sc.nextInt();
        int []arr2 = new int[sizeOfSecondArray];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < sizeOfSecondArray; i++) {
            arr2[i] = sc.nextInt();
        }
        mergedArray(arr1, arr2);
    }

    private static void mergedArray(int[] arr1, int[] arr2) {
        int size = arr1.length + arr2.length;
        int []arr3 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[j+arr1.length] = arr2[j];
        }
        System.out.println("First Array is :"+Arrays.toString(arr1));
        System.out.println("Second Array is :"+Arrays.toString(arr2));
        System.out.println("After merged first and second array: "+Arrays.toString(arr3));
        System.out.println("Length of third array : "+arr3.length);
    }
}
