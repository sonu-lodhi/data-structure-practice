package basicprogram;

import java.util.Scanner;

//How to convert Fahrenheit to celsius
public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit : ");
        int temperature = sc.nextInt();

        int celsius = ((temperature-32)*5)/9;

        System.out.println("Temperature in celsius "+ celsius);

    }

}
