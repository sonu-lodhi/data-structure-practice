package datastructure.algo;

import java.util.ArrayList;
import java.util.Queue;

public class QueueSolution {
    public static void main(String[] args) {
        QueueUsingArray q2 = new QueueUsingArray(5);
        q2.enqueue(2);
        q2.enqueue(4);
        q2.enqueue(8);
        q2.display();
        q2.dequeue();
        System.out.println();
        q2.display();

    }
}
