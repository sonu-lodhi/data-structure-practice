package basicprogram.programs;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word = sc.nextLine();

        HashMap<Character, Integer> emp = new HashMap<Character, Integer>();
        char []ch = word.toCharArray();
        for (char c:ch) {
            if (emp.containsKey(c)) {
                int x = emp.get(c);
                emp.put(c, x+1);
            }else {
                emp.put(c, 1);
            }
        }
        System.out.println(emp);
    }
}
