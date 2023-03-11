package datastructure.algo;

import java.util.Iterator;
import java.util.Stack;

public class StackSolution {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //inserting element into stack
        stack.push(11);
        stack.push(10);
        stack.push(9);
        stack.push(8);
        stack.push(7);;
        System.out.println(stack);

        //delete operation on stack
        stack.pop();
        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);

        //peek operation to get the top element of stack
        System.out.println(stack.peek());

        boolean status = stack.empty();
        System.out.println(status);
        int indexFound =stack.search(4);
        System.out.println(indexFound);

        //how to iterate over a stack
        Iterator it = stack.iterator();
        while (it.hasNext()){
            Object stack1 = it.next();
            System.out.print(stack1);
        }
        System.out.println();
        System.out.println(stack.size());
        stack.sort(null);
        System.out.println(stack);

    }
}
