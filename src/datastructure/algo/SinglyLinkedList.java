package datastructure.algo;

public class SinglyLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode( int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){
        Node current = head;

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Node of singly linked list");
        while(current !=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.addNode(10);
        sList.addNode(20);
        sList.addNode(30);
        sList.addNode(40);
        sList.addNode(50);

        sList.display();

    }

}
