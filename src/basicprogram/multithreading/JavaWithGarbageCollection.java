package basicprogram.multithreading;

public class JavaWithGarbageCollection {
    public static void main(String[] args) {
          System.out.println("main method started");
//        String dayname = "no day"; //type unsafety
//        System.out.println("Today is "+dayname);
//        int monthindigit = 20;
//        System.out.println(monthindigit);

        DayName day = DayName.TUESDAY;
       DayName[] day1 = DayName.values();
       // DayName day = "No Day";
        for (DayName days:day1) {
            System.out.println("Today is "+days);
        }
        //System.out.println("Today is "+day1[0]);

        System.out.println("main method ended");
    }
}
