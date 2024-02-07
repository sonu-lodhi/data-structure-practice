package basicprogram.java8features.lambda;

public class AreaOfCircle {
    private static double PI = 3.14159;
    private double radius;

    public AreaOfCircle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaOfCircle aoc = new AreaOfCircle(5.0);
        System.out.println("Area of circle is : "+ aoc.getArea());


        AreaOfCircle[] ac = new AreaOfCircle[10];
        //ac[0] = 20;

        //valid
        Object[] obj = new Object[10];
        obj[0] = 10000;

        System.out.println(obj[0]);

        int[] a1 = new int[10];
    }
}
