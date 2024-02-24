package basicprogram.dsaclass;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int []arr = new int[size];

        System.out.println("Enter the element in array: ");
        int i = 0;
        int len = arr.length;
        while(i<len){
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);

        if(result != -1){
            System.out.println("Element found at index is : "+result);
        }else {
            System.out.println("Element not found in the given array");
        }

    }

    static int binarySearch(int []arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid]<target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;// element not found
    }
}
