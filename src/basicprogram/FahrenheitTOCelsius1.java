package basicprogram;

import java.util.Scanner;

public class FahrenheitTOCelsius1 {
    public static void main(String[] args) {
        float F, C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit of temperature (C/F):F");
        System.out.print("Enter temperature in (F): ");
        F = sc.nextFloat();
        C = (F-32)*5/9;
        System.out.println(C + " C");
    }
}
