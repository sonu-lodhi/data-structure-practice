package basicprogram.multithreading;

public class Table {
    //synchronised method
//   synchronized void printTable(int num){
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num*i);
//        }
//        try{
//            Thread.sleep(400);
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }

    //Not synchronized method
    synchronized void printTable(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num*i);
        }
        try{
            Thread.sleep(400);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
