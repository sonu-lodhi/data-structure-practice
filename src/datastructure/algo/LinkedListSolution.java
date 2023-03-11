package datastructure.algo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSolution {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //adding elements to linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(60);
        list.add(2, 40);
        //remove elements from linked list
        //list.remove(2);
        //list.removeFirst();
        //list.removeLast();

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println(list.size());

        boolean b1 = list.contains(40);
        System.out.println(b1);
    }
}
