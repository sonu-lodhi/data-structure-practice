package basicprogram;

import java.util.Scanner;

public class CalculatorOfArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //This is for calculate to Area of circle.
        /*System.out.print("Enter the radius of circle: ");
        int radius = sc.nextInt();
        System.out.println("Area of circle is "+ calToAreaOfCircle(radius));*/

        System.out.print("Enter the Breadth of rectangular : ");
        int breadth = sc.nextInt();
        System.out.print("Enter the length of the rectangular : ");
        int length = sc.nextInt();

        System.out.println("Area of rectangular is "+ calToAreaOfRectangular(breadth, length));

    }

    private static int calToAreaOfRectangular(int breadth, int length){
        return breadth*length;
    }

    private static float calToAreaOfCircle(int radius) {
        return (3.14f)*radius*radius;
    }
}
