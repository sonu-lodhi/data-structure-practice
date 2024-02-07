package basicprogram.stringbasicpro;
//convert uppercase char to lowercase and lowercase to uppercase
public class StringProgram {
    public static void main(String[] args) {
        String str = "Hello67@BYeHoWareYou";
        String ans = "";
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch+=32;
            } else if (ch >= 'a' && ch <= 'z') {
                ch-=32;
            }

            ans = ans+ch;
        }
        System.out.println(ans);
    }
}
