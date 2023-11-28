package basicprogram;

import java.util.Scanner;

public class SearchCharInWord {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.println("Enter a word:");
        String word = sc.nextLine();

        // Prompt the user to enter a character
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        // Close the scanner
        sc.close();

        // Call the search method to find the character in the word
        int index = search(word, ch);

        // Display the result
        if (index == -1) {
            System.out.println("The character " + ch + " is not found in the word " + word);
        } else {
            System.out.println("The character " + ch + " is found in the word " + word + " at index " + index);
        }
    }

    // A method that returns the index of the first occurrence of a character in a word, or -1 if not found
    public static int search(String word, char ch) {
        // Loop through the word
        for (int i = 0; i < word.length(); i++) {
            // If the character matches, return the index
            if (word.charAt(i) == ch) {
                return i;
            }
        }
        // If the character is not found, return -1
        return -1;
    }
}


