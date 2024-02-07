package oopspreprations.callByValue;

public class PassByValue {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before Method Execution Value is : "+x);
        ModifyValue(x);
        System.out.println("After Method Execution value is : "+x);
    }
    public static void ModifyValue(int value){
        value = 50;
        System.out.println("Inside Method Value is : "+value);
    }
}
