package collectionframework.string;

import java.util.Scanner;

public class FindLongestWordsLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String sentance = input.nextLine();

        int maxLengthOfEevenWords = findMaxLengthOfEevenWords(sentance);

        if(maxLengthOfEevenWords == -1){
            System.out.println("No even-words find in the given string.");
        }else {
            System.out.println("Length of the longest even-length word is :"+maxLengthOfEevenWords);
        }
    }
    static int findMaxLengthOfEevenWords(String sentance){
        int maxLength = -1;
        String []words = sentance.split("\\s+");
        for (String word:words) {
            if(word.length()%2==0 && word.length()>maxLength){
                maxLength = word.length();
            }
        }
        return maxLength;
    }
}
