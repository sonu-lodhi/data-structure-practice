package basicprogram.oops.exception;

import com.sun.tools.javac.Main;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numerator : ");
        float n = sc.nextFloat();
        System.out.println("Enter Denominator : ");
        float d = sc.nextFloat();
        Calculator calc = new Calculator();
        calc.division(n, d);

    }
}
