package basicprogram.oops.polymorphism;

public class Child extends Parents{
    @Override
    void run() {
        System.out.println("child run() method");
        super.run();
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("child walk method");
    }
}
