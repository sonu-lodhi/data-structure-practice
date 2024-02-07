package basicprogram.oops.inheritance;

//it called as Singleton class, we have only one instance.
public class Demo1 {
    private static Demo1 d1;
    private Demo1(){
        System.out.println("Creating instance of the Demo1 class");
    }

//    public static Demo1 getInstance() {
//        Demo1 d1 = new Demo1();
//        return d1;
//    }
    public static Demo1 getInstance() {
         d1 = new Demo1();
        return d1;
    }

    public void test(){
        System.out.println("running test() method");

    }
    public void disp(){
        System.out.println("running disp() method");
    }
    static Demo1 createObject(){
        if(d1 == null) {
            d1 = new Demo1(); //this is local object, inside method
        }
            return d1;
    }
}
