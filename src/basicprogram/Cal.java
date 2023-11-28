package basicprogram;

public class Cal {
    public static void main(String[] args) {
        try {

            int num = 100/0;
            System.out.println(num);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong");
        }finally {
            System.out.println("finally block closed.");
        }
    }
}
