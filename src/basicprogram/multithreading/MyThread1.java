package basicprogram.multithreading;

public class MyThread1 extends  Thread{
Table t1;
MyThread1(Table t1){
    this.t1 = t1;
}

public void run(){
    t1.printTable(5);
}

}
