package basicprogram.stringbasicpro;

import java.util.Scanner;

public class SearchCharacterInSubString {
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word : ");
        String word = sc.nextLine();
        System.out.print("Enter the character to search : ");
        String character = sc.nextLine();
        char char1 = character.charAt(0);
        int flag =0;
        for (int i = 0; i <word.length(); i++) {
            if (word.charAt(i) == char1){
                System.out.println("Character "+char1+" is present in the word "+word);
                flag++;
                break;
            }

        }
        if(flag == 0){
            System.out.println("Character "+char1+" is not present in the word "+word);
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word = sc.nextLine();
        System.out.print("Enter the character to search : ");
        char ch = sc.next().charAt(0);
        sc.close();

        int index = search(word, ch);

        if(index == -1){
            System.out.println("Character "+ch+" is not present in the word "+word);
        }else {
            System.out.println("Character "+ch+" is present at index "+index +" in the word "+word);
        }
    }

    public static int search(String word, char ch){
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)==ch){
                return i;
            }
        }

        return -1;
    }
}
