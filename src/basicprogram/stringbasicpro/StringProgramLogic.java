package basicprogram;

import java.util.Scanner;

public class StringProgramLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = sc.nextLine();
       boolean str2 = stringCheck(str);
        System.out.println(str2);

    }
    public static Boolean stringCheck(String str){
        boolean checking = true;
        String string = "0123456789";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)== string.charAt(j)){
                    return checking;
                }else {
                    return false;
                }
            }

        }
        return checking;
    }
}
