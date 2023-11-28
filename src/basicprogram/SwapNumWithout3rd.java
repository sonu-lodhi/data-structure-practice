package basicprogram;

import java.util.Scanner;

public class SwapNumWithout3rd {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Before Swaping\na = "+a+"\nb = "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swaping\na = "+a+"\nb = "+b);

    }

}
