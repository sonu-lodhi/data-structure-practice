package datastructure.algo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The row size of array : ");
        int r = sc.nextInt();
        System.out.println("Please Enter The column size of array : ");
        int c = sc.nextInt();
       // int arr[] = new int[n];

//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        arr[5] = 60;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        //Create and implementation of 1D Array
//        int count=1;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = count;
//            count++;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }


        //Create and implementation of 1D Array
        int[][] arr = new int[r][c];
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
