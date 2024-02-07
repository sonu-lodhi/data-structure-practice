package oopspreprations.multipleInheritance.modules;

import oopspreprations.multipleInheritance.interfaces.Interface1;
import oopspreprations.multipleInheritance.interfaces.Interface2;

public class MyClassForAchiveMultipleInheritance implements Interface1, Interface2 {

    @Override
    public void method1() {
        System.out.println("Implementation of Method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation of Method2");
    }
}
