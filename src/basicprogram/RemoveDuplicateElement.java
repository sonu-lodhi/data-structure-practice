package basicprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        Integer arr[] = {10,20,30,30,45,41,35,50,50,70,60,80};
        Arrays.sort(arr);
        removeDuplicateElement(arr);
    }

    private static void removeDuplicateElement(Integer[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        Integer[] temp = new Integer[arr.length];
        int j=0;
        for (Integer element : arr) {
           if (set.add(element)){
               temp[j++] = element;
           }
        }

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i]+" ");
        }
    }
}
