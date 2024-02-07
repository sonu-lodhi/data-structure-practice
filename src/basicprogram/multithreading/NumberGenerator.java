package basicprogram.multithreading;

public class NumberGenerator {
    private int stratNum;
    private int endNum;

    public NumberGenerator(int stratNum, int endNum) {
        this.stratNum = stratNum;
        this.endNum = endNum;
    }
//    void generate(){
//        Thread curTh = Thread.currentThread();
//        String thName = curTh.getName();
//        System.out.println("Generating sequence of numbers from "+stratNum+" to "+ endNum);
//        for (int i = stratNum; i <=endNum ; i++) {
//            System.out.println(thName+": i= "+i);
//            try{
//                Thread.sleep(1000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }

    synchronized void generate(){
        Thread curTh = Thread.currentThread();
        String thName = curTh.getName();
        System.out.println("Generating sequence of numbers from "+stratNum+" to "+ endNum);
        for (int i = stratNum; i <=endNum ; i++) {
            System.out.println(thName+": i= "+i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
