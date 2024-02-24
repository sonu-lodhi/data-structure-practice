package basicprogram.oops.upcasting;

public class UpCasting {
    public static void main(String[] args) {
//        Parent obj = new Child();
//        obj.test();//This is child method!!!
        Parent obj1 = (Parent) new Child();
        Parent obj2 = (Parent) new Child();
        obj1.test();//This is child method!!!
        obj2.test();//This is child method!!!
    }
}
