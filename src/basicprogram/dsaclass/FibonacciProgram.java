package basicprogram.dsaclass;

public class FibonacciProgram {
    public static void main(String[] args) {
        int i=0;
        int j=1;
        System.out.print(i+" ");
        System.out.print(j+" ");
        for (int k = 0; k < 18; k++) {
            int n = i+j;
            System.out.print(n+" ");
            i=j;
            j=n;
        }
    }
}
