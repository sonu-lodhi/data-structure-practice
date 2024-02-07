package collectionframework.wrapperclass;

import java.util.HashSet;
import java.util.Iterator;

public class LearningSet {
    public static void main(String[] args) {
        //creating empty Hash set
        HashSet s1 = new HashSet();
        System.out.println("No of element in hash set"+s1.size());
        System.out.println("Is set empty?:"+s1.isEmpty());
        s1.add(100);
        s1.add(26.30);
        s1.add("sonu lodhi");
        s1.add(null);
        System.out.println("No of element in set: "+s1.size());
        System.out.println("Is set empty?:"+s1.isEmpty());
        System.out.println("I am printing the elements"+s1);
        System.out.println("adding duplicate elements");
        s1.add(100);
        System.out.println(s1);

        for (Object element:s1) {
            System.out.println(element);
        }



    }
}
