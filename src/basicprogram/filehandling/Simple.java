package basicprogram.filehandling;

public class Simple {
    public int getValue(){
        try{
            System.out.println("inside try block");
            System.out.println(10/5);
            return 30;

        }catch (Exception e){
            System.out.println("inside catch block");
           return 20;
        }
        finally {
            return 60;
        }
        //return 10;// Unrea
    }
}
