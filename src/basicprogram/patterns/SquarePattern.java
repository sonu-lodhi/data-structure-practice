package basicprogram.patterns;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any number : ");
        int num = sc.nextInt();
        printSquarePattern(num);
    }

    // Function to demonstrate pattern
    private static void printSquarePattern(int num) {
        int i, j;
        // outer loop to handle number of rows
        for ( i = 0; i <num ; i++) {
            //  inner loop to handle number of columns
            for (j = 0; j < num ; j++) {
                // star will print only when  it is in first
                // row or last row or first column or last
                // column
                if(i==0 || j == 0 || i == num-1 || j == num-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
            
        }
    }
}
