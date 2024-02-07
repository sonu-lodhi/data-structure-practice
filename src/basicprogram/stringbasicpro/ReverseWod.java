package basicprogram.stringbasicpro;

import java.util.Scanner;

public class ReverseWod {

    static String reverseWords(String str){
        String []words = str.split("\\s");
        String result = "";
        for (String w:words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            result=result+sb.toString()+" ";
        }
        return result.trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWords(str));
    }
}
