package datastructure;

import java.util.Arrays;
import java.util.Iterator;

public class DuplicateFromArray {
    public static void main(String[] args) {
        final int[] arr = { 10, 20, 30, 40, 50, 50, 10, 20 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr);
        }
        removeDuplicate(arr);
    }

    private static void removeDuplicate(int[] arr) {
        final int[] temp = new int[arr.length];

    }
}
