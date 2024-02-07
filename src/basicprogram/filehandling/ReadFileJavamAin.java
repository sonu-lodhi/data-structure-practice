package basicprogram.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class ReadFileJavamAin {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
        //System.out.println(br.lines().collect(Collectors.toList()));
        int count =0;
        //How many lines are there in given file
        /*while(br.readLine()!=null){
            count++;
        }
        System.out.println(count);*/

        //how many words are there in the file

//        while(br.readLine()!=null){
//            count++;
//        }
//        System.out.println(count);

        String s = "";
        int w = 0;
        while(br.readLine()!=null){
            System.out.println(s);
            String[] arr = s.split("");
            w=w+ arr.length;
        }
        System.out.println("No of words : "+w);
    }
}
//write a java program to check number of palindrome words in the given file
