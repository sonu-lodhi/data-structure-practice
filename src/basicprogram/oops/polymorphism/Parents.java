package basicprogram.oops.polymorphism;

public class Parents {
    void walk(){
        System.out.println("Parent walk method");
    }

    void run(){
        System.out.println("Parent run() method");
        walk();
    }
}
