package basicprogram.java8features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class JavaMain {

    public static void main(String[] args) {
        //MyFunction mf = (i)-> System.out.println("lambda expression executed........");
        //mf.test(15);

        //MyFunction mf = (i) -> i*10;
        //System.out.println(mf.cal(15));

        //MyFunction mf = (s1,s2)-> s1+"-"+s2;
        //System.out.println(mf.fun("sonu", "lodhi"));

        //Function<Integer, String> function = (t)-> "output : "+t;
        //System.out.println(function.apply(88));

        //Stream API
        List<Integer> list = Arrays.asList(23,4,6,8,9,1,2,10);
        //list.stream().filter(t->t>4).sorted().forEach(t-> System.out.print(t+" "));
        //list.stream().filter(t->t>4).sorted().forEach(System.out::println);
        //list.stream().filter(t->t>4).sorted().forEach(JavaMain::printElementM1);
        JavaMain javaMain = new JavaMain();
        list.stream().filter(t->t>4).sorted().forEach(javaMain::printElementM2);
    }

    public static void printElementM1(int e){
        System.out.println(e);
    }

    public void printElementM2(int e1){
        System.out.println(e1);
    }
}
