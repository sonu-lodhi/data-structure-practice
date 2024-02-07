package basicprogram.oops.inheritance;

public class JavaMainclass{
    public static void main(String[] args) {
        System.out.println("Started main method().......");
        Demo1 d1 = Demo1.createObject();
        Demo1 d2 = Demo1.createObject();
        Demo1 d3 = Demo1.createObject();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
//        Demo1 d4 = Demo1.getInstance();
//        Demo1 d5 = Demo1.createObject();
//        Demo1 d6 = Demo1.createObject();


        System.out.println();

        System.out.println();
        System.out.println("Ended main method()........");
    }
}
