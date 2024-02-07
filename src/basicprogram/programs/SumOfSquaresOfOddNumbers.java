package basicprogram.programs;

import java.util.ArrayList;
import java.util.List;

public class SumOfSquaresOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        long sumOfSquareOfOddNumber = list.stream()
                .filter(n -> n%2 != 0)
                .mapToLong(n -> n*n)
                .sum();

        System.out.println("Sum of the square of odd numbers is : "+sumOfSquareOfOddNumber);
    }
}
