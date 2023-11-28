package collectionframework;

import java.util.*;

public class CollectionOperations {
    public static void main(String[] args) {

        Stack<Integer> list = new Stack<>();
        list.add(1000);
        list.add(1000);
        list.add(1001);
        list.add(1002);
        list.add(1003);
        list.add(1002);


        System.out.println("element at index: "+list.hashCode());

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
