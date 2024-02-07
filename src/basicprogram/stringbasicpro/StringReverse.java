package basicprogram;

public class StringReverse {
    public static void main(String[] args) {
        String str = "java is a programming";

        reverseString(str);
    }

    private static void reverseString(String str) {
        int str1 = str.length();
        char ch;
        String str2 = "";
        for (int i =0; i<str1; i++) {
            ch = str.charAt(i);
            str2 = ch + str2;
        }
        System.out.println(str2);
    }
}
