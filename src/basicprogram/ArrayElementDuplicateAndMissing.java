package basicprogram;

import java.util.HashSet;
import java.util.Iterator;

public class ArrayElementDuplicateAndMissing {

    public static void main(String[] args) {
        int []arr ={1,2,2,3,4,5,6,8};
        int num = 7;
        missing_element(arr, num);
    }
    private static void missing_element(int[]arr, int num) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);

        }
        Iterator<Integer> iterator = hashSet.iterator();

    }
}
