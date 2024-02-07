package basicprogram.stringbasicpro;

public class ReArrangeString {
    public static void main(String[] args) {
        String str = "abc@133hj78$#@kl";
        //o/p -> abchjkl13378@$#@
        String alpha = "", num = "", spcialChar ="";

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if((ch >='A' && ch < 'Z') || (ch >= 'a' && ch <='z')){
                alpha = alpha+ch;
            } else if (ch >= '0' && ch <= '9') {
                num = num+ch;
            }else {
                spcialChar = spcialChar+ch;
            }
        }
        System.out.println(alpha+num+spcialChar);
    }


}
