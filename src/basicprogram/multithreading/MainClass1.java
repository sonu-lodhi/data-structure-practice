package basicprogram.multithreading;
//----------Notes-------------------------------------
//when jvm start excution the jvm internal creates a thread by name main. the main thread is responsible to start the execution. thread main always makes a static call to the main method hence the mai  method should be satatic the main method should be public becouse it should be accessible by the main thread. the thread main passed string array while calling the main method. hence the main method parameter should be string array type. the thread main create string array with the command line args and passed the array into the main method.
//CLI Command Line Interface
//GUI Graphical User Interface
//WEB
//The JVM also start internal thread by and garbageCollectorThread. the thread scheduler is responsible the scheduler the thread for execution based on the thread priority the garbage Collector thread to perform the garbage Collection process.
// A has-a B

//
public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        Thread curTh = Thread.currentThread();// returning ref. to current running thread.
        System.out.println("Thread ID: "+curTh.getId());
        System.out.println("Thread Name : "+curTh.getName());
        System.out.println("Thread priority : "+curTh.getPriority());
        System.out.println("Total Arguments Passed : "+args.length);

        for (int i = 0; i < args.length ; i++) {
            System.out.println(args[i]);
        }
        System.out.println("Main method ended");
    }

}
