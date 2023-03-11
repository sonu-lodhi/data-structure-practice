import java.util.HashSet;
import java.util.Set;

public class ArrayElementsOfSum {
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 30, 50, 61, 59, 80, 50, 71, 69, 60};
        sortingArray(arr);
    }

    private static void sortingArray(int[] arr) {
        Set<Integer> arrlist = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
                arrlist.add(arr[i]);
        }

        System.out.println(arrlist);
    }
}
