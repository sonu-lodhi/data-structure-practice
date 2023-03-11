package datastructure.algo;

public class QueueUsingArray {
    int front_Q, rear_Q;
    int capacityOfQueue;

    static int[] q1;

    QueueUsingArray(int size){
        capacityOfQueue=size;
        q1= new int[capacityOfQueue];
    }
    void enqueue(int value){
        if(rear_Q==capacityOfQueue){
            System.out.println("queue is already full, you can not insert element");
        }else {
            q1[rear_Q]=value;
            rear_Q++;
        }

    }
    void dequeue(){
        if(rear_Q==0){
            System.out.println("queue is empty, there is nothing to delete");
        }else {
            for (int i = 0; i <rear_Q-1 ; i++) {
                q1[i] = q1[i+1];
            }
            rear_Q--;
        }
    }

    void display(){
        if(rear_Q==0){
            System.out.println("queue is empty, there is nothing to display");
        }else {
            for (int i = 0; i < rear_Q; i++) {
                System.out.print(q1[i]+" ");
            }
        }
    }
}
