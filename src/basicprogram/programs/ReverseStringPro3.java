package basicprogram.programs;


import java.util.Scanner;

public class ReverseStringPro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String str = sc.nextLine();
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse = reverse+str.charAt(i);
        }

        System.out.println(reverse);

    }

}
