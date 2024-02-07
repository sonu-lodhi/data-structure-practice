package basicprogram.programs;

import java.util.Scanner;

public class LengthOfWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any words : ");
        String inputString = sc.nextLine();

        int result = maxLengthCalculator(inputString);

        System.out.println("Length of the longest word with even length : "+result);
    }

    private static int maxLengthCalculator(String inputString) {
        int maxLength = 0;
        String []words = inputString.split("\\s+");

        for (String word : words  ) {
            if (word.length() % 2 == 0 && word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        return maxLength;
    }
}
