package basicprogram.multithreading;

public class JavaMainClass {
    public static void main(String[] args) {
            System.out.println("Started Main method.");
            NumberGenerator ng = new NumberGenerator(1,25);
            NumberGeneratorThread ngt1 = new NumberGeneratorThread(ng);
            NumberGeneratorThread ngt2 = new NumberGeneratorThread(ng);
            NumberGeneratorThread ngt3 = new NumberGeneratorThread(ng);

            ngt1.setName("NGT-1");
            ngt2.setName("NGT-2");
            ngt3.setName("NGT-3");

            ngt1.start();
            ngt2.start();
            ngt3.start();
            System.out.println("ended main method");
    }
}
