package basicprogram;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter base value of triangle :");
            double base = scanner.nextDouble();
            System.out.println("Enter height value of triangle :");
            double height = scanner.nextDouble();

            double area = AreaOfTriangleCal(base, height);

            System.out.println("Area of triangle is :" + area);
        }


    }

    static double AreaOfTriangleCal(double base, double height) {

        double area = (base * height) / 2;

        return area;
    }
}
