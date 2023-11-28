package oopspreprations;

public class OopsPrepration {
    void sum(int a,int b){System.out.println("int arg method invoked");}
    void sum(long a,long b){System.out.println("long arg method invoked");}
    public static void main(String[] args) {
    Polymorphism polymorphism = new Polymorphism();
        //-----------------Overloading with changing no. of arguments-----------------
        System.out.println(polymorphism.addtion(10, 20));
        System.out.println(polymorphism.addition(10,30,60));

        //-----------------Overloading with changing data type of arguments------------------------
        System.out.println(polymorphism.addtion(10, 20));
        System.out.println(polymorphism.addition(10.5,30.5));

        //-----------------Overloading with TypePromotion----------------------------
        System.out.println(polymorphism.addtion(10, 20));
        System.out.println(polymorphism.addition(10.5,30.5));

        OopsPrepration oops = new OopsPrepration();
        oops.sum(10l,20l);

        polymorphism.addition30(30,500);
    }
}
