package basicprogram;

import java.util.Arrays;

public class MeargedTwoArray {

    static void mergedArrays(int []x, int []y){
        int size = x.length + y.length;
        int []z = new int[size];
        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];
        }
        for (int i = 0; i < y.length; i++) {
            z[i+x.length] = y[i];
        }
        System.out.println(Arrays.toString(z));
    }
    public static void main(String[] args) {
        int []x = {10, 20, 40, 30, 55, 63};
        int []y = {80, 84, 85};
        mergedArrays(x, y);
    }
}
