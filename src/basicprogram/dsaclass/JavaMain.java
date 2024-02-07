package basicprogram.dsaclass;

import java.util.*;
import java.util.stream.Collectors;

public class JavaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of ArrayList: ");
        int size = sc.nextInt();
        ArrayList l1 = new ArrayList();
        System.out.println("Enter the list elements: ");
        for (int i = 0; i < size; i++) {
            String s = sc.next();
            l1.add(s);
        }
        System.out.println("Enter the size of second ArrayList: ");
        int size2 = sc.nextInt();
        ArrayList l2 = new ArrayList();
        System.out.println("Enter the list elements: ");
        for (int i = 0; i <size2 ; i++) {
            String s = sc.next();
            l2.add(s);
        }
        l1.addAll(l2);//merging two arraylist and storing in l1
        LinkedHashSet s1 = new LinkedHashSet<>(l1);//conversion of arraylist to linkedlist
        Object s2 = s1.stream().sorted().collect(Collectors.toList());
        System.out.println(s2);
    }
}
