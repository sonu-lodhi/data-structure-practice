package basicprogram.stringbasicpro;

import java.util.Scanner;

public class VowelsAndConsonants {

    private static char checkVowelsOrConsonants(char str) {

        if(str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u'){
            System.out.println("Entered character is " +str+ " vowel.");
        } else if ((str>='a' && str<='z')||(str>='A' && str<='Z')) {
            System.out.println("Entered character is " +str+ " vowel.");
        }else {
            System.out.println("Entered Alphabet is ");
        }
        return str;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char str = sc.next().charAt(0);
        System.out.println("........."+checkVowelsOrConsonants(str));
    }


}
