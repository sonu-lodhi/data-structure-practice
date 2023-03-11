import java.util.HashSet;
import java.util.Set;

public class UnionUsingSet {
    public static void main(String[] args) {
        int [] set1 = {1, 3, 2, 4, 8, 9, 0};
        int []set2 = {1, 3, 7, 5, 4, 0, 7, 5};
        UnionOperation(set1, set2);
    }

    private static void UnionOperation(int[] set1, int[] set2) {
        Set<Integer> arrlist = new HashSet<>();
        for (int a = 0; a < set1.length; a++) {
            arrlist.add(set1[a]);
        }
        for (int i = 0; i < set2.length; i++) {
            arrlist.add(set2[i]);
        }
        System.out.println(arrlist);
    }
}
