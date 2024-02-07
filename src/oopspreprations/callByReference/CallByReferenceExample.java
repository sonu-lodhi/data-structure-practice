package oopspreprations.callByReference;

public class CallByReferenceExample {
    public static void main(String[] args) {
        EntityClass ec = new EntityClass(10);
        System.out.println("Before Method Execution value is : "+ec.value);
        ModifyValue(ec);
        System.out.println("After Method Execution Value is : "+ec.value);
    }
    public static void ModifyValue(EntityClass obj){
        obj.value = 20;
        System.out.println("Inside Method value is : "+obj.value);

    }
}
