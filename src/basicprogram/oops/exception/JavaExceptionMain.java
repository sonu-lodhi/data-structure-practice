package basicprogram.oops.exception;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class JavaExceptionMain {
    public static void main(String[] args) {
        try{
            int r =10/2;
            try {
                int []arr = new int [5];
                arr[2] = 10;
            }catch (Exception ex3){
                System.out.println("Nested block executed");
            }

        }catch (Exception ex){
            System.out.println("main catch block executed");
            try{
                int []arr2 = new int [5];
                arr2[4] = 10;
            }catch (IndexOutOfBoundsException exa){
                System.out.println("IndexOutOfBoundsException");
            }
        }finally {
            try{
                String path = "D:\\DataStructure\\javaexception.txt";

                try{
                    File file = new File(path);
                    Scanner sc = new Scanner(file);
                    while (sc.hasNextLine()){
                        String str = sc.nextLine();
                        System.out.println(str);
                    }

                }catch (FileNotFoundException ex5){
                    System.out.println("FileNotFoundException");
                }


            } catch (IndexOutOfBoundsException ex2){

                System.out.println("IndexOutOfBoundException2");
            }catch (Exception et1){

            }finally {
                System.out.println("finally block executed...........");
            }
        }
    }
}
