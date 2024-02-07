package datastructure.algo;


public class StackImpl {

    static int []stack;
    static int top;
    private static void createStack(int size) {
        stack = new int[size];
        top=-1;
        System.out.println("Stack had been created with size:"+size);
    }

    private static void push(int ele){
        if(top== stack.length-1){
            System.out.println("stack overflow...!!");
        }else {
            top++;
            stack[top]=ele;
            System.out.println(ele+" had been added to stack....!!");
        }
    }

    private static void pop(){
        if(top == -1){
            System.out.println("Stack Underflow....!!");
        }else {
            System.out.println(stack[top]+" had been deleted...!!");
            stack[top] = 0;
            top--;
        }
    }

    static void display(){
        System.out.println("=============Stack Details===========");
        if(top==-1){
            System.out.println("stack is Empty......!!!");
        }else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
        System.out.println("=============================");
    }
    static boolean isEmpty(){
        return  top == -1;
    }
    static boolean isFull(){
        return  top == stack.length-1;
    }
    public static void main(String[] args) {
        createStack(5);
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);
        push(70);
        pop();
        pop();
    }


}
