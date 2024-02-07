package basicprogram.multithreading;

public class MyThread2 extends Thread{
Table t2;
MyThread2(Table t2){
    this.t2=t2;
}

    @Override
    public void run() {
        t2.printTable(100);
    }
}
