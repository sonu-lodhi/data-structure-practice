package datastructure;

import java.util.Scanner;

//write a program to find element in the array
public class LinearSearchSolution {

    public static int linearSearch(int arr[], int key){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Please enter any key : ");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);
        System.out.println("element found at index : "+index );
    }
}
