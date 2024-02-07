package basicprogram.multithreading;

public class NumberGeneratorThread extends Thread {
    NumberGenerator ng;
    public NumberGeneratorThread(NumberGenerator ng){
        this.ng = ng;
    }

    @Override
    public void run() {
        ng.generate();
    }
}
