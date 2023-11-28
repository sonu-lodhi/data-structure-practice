package basicprogram;

import java.util.Scanner;

//How to swap 2 no using 3rd variable
public class SwapToNumUsing3rd {
    public static void main(String[] args) {
        int a, b, temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Before Swaping\na = "+a+"\nb = "+b);
        temp = a;
        a    = b;
        b    = temp;
        System.out.println("After Swaping\na = "+a+"\nb = "+b);

    }
}
