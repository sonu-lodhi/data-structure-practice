package basicprogram.stringbasicpro;
//write a program to reverse string in java
public class StringReverse1 {
    public static void main(String[] args) {
        String str = "What is difference between SQL and MySQL";
        String str1="";
        System.out.println("Before reverse -> "+str);
        System.out.println(str.length());
        String rev = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }

}
