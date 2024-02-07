package basicprogram.programs;

public class PalindromeNumberAvailableBetween1To100 {
    public static void main(String[] args) {
        for (int num =1; num <=160; num++) {
            int a, i=0, j=0;
            a=num;
            while(a>0){
                i = a%10;
                j = (j*10)+i;
                a=a/10;
            }
            if (j == num) {
                System.out.println(num);
            }
        }
    }
}
