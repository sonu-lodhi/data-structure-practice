//Access elements from a linkedlist

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> langauges = new LinkedList<>();

        // add elements in the LinkedList
        langauges.add("Java");
        langauges.add("Python");
        langauges.add("C Programming");
        langauges.add("C++ Programming");

        // get the element from the LinkedList
        String str = langauges.get(2);
        System.out.println("Element at index 1: "+ str );

    }

}
