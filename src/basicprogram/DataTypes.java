package basicprogram;

public class DataTypes {

    static void display(int a, int b){
        int sum = a+b;
        System.out.println("Addition of two numbers" +sum);
    }
    static int addition(int a, int b){
        int sum = a+b;
        return sum;
    }



    public static void main(String[] args) {

        display(10, 20);
        addition(10,20);
        System.out.println();
    }
}
