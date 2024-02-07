package collectionframework.wrapperclass;

public class JavaMain {
    public static void main(String[] args) {
        //Boxing Operation -----> representing primitives as a Object...
        Integer num = new Integer(101);
        Double num1 = new Double(1.5);

        Long ln = new Long(12);
        Short sh = new Short((short)10);
        Character ch = new Character('A');
        Boolean b = new Boolean(false);

        System.out.println("Original Values and Hash Code Values..............");
        System.out.println("-----------Boxing Operation----------------");
        System.out.println("Original Integer : "+num+", HashCode of Integer : "+num.hashCode());
        System.out.println("----------Un-Boxing Operation----------");
        int n1 = num.intValue();
        System.out.println("primitive value : "+ n1);
        System.out.println("Double : "+num1.hashCode());
        System.out.println("Long : "+ln.hashCode());
        System.out.println("Short : "+ sh.hashCode());
        System.out.println("Character : "+ch.hashCode());
        System.out.println("Boolean : "+b.hashCode());

        System.out.println("-----------AutoBoxing Operation");
        Integer lm = 100;
        lm = 200;
        Double double1 = 1000.0;
        System.out.println(lm);
        System.out.println(double1);

        System.out.println("---------Auto UnBoxing------------");
        int n2 = lm;
        double d = double1;
        System.out.println(n2);
        System.out.println(d);

        System.out.println("----------Addition is performed by reference------");
        Integer i3 = 10;
        Integer i4 = 20;
        Integer res = i3+i4;
        //i3 and i4 are unboxed
        //addition is performed
        //result is auto boxed to Integer
        System.out.println("Result of Sum : "+ res);
        Object ob1 = new Object();
        Object ob = new String("string");
        Object ob2 = 100;
        //int n= ob2; failed due to not down casting
        int n5 = (Integer) ob2; //valid
        System.out.println(ob2);


    }
}
