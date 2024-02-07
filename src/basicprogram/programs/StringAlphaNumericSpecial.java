package basicprogram.programs;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringAlphaNumericSpecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence : ");
        String str = sc.nextLine();
        String alpha ="", num ="", specialCharacter = "";

        for (int i = 0; i < str.length()-1; i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'z' || ch >= 'a' && ch <= 'z'){
                alpha = alpha+ch;
            } else if (ch >= '0' && ch <= '9') {
                num = num+ch;
            }else {
                specialCharacter = specialCharacter+ch;
            }
        }
        System.out.println(alpha+num+specialCharacter);
    }
}
