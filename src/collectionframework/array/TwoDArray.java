package collectionframework.array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        int [][]arr = new int [rows][cols];
        System.out.println("Enter the Elements into 2D Array: ");
        takeInputByUser(arr, rows, cols, input);

        System.out.println("This is our 2D Array");
        print2DArray(arr, rows, cols);
        System.out.println("Enter the key :");
        int key = input.nextInt();
        indicesFindByElement(arr,rows,cols,key);
    }
    static void takeInputByUser(int [][]arr, int rows, int cols, Scanner input){
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr[i][j] = input.nextInt();
            }
        }
    }
    static void print2DArray(int [][]arr, int rows, int cols){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void indicesFindByElement(int [][]arr, int rows, int cols, int key){
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                if(arr[i][j] == key){
                    System.out.println("x found at locations ("+i+" x "+j+")");
                }
            }
        }
    }
}
