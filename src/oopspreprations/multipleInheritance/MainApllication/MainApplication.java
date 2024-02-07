package oopspreprations.multipleInheritance.MainApllication;

import oopspreprations.multipleInheritance.modules.MyClassForAchiveMultipleInheritance;

public class MainApplication {
    public static void main(String[] args) {
        //create an object of the class
        MyClassForAchiveMultipleInheritance mi = new MyClassForAchiveMultipleInheritance();
        mi.method1();
        mi.method2();

        final int num = 10;
       // num = 5;//Cannot assign a value to final variable 'num'
        int x=50;
        System.out.println("before method execution value is : "+x);
        modifyValue(x);
        System.out.println("After method execution value is : "+x);
    }

    public static void modifyValue(int value){
        value = 20;
        System.out.println("Inside the method : "+value);
    }
}
