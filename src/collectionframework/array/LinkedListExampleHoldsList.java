package collectionframework.array;


import java.util.LinkedList;
import java.util.List;

public class LinkedListExampleHoldsList {
    public static void main(String[] args) {

        LinkedList<TokenList> listOfTokenLists = new LinkedList<>();

        // Example: Creating and adding token lists
        List<String> list1 = List.of("apple", "orange", "banana");
        List<String> list2 = List.of("cat", "dog", "fish");
        List<String> list3 = List.of("java", "python", "javascript");

        listOfTokenLists.add(new TokenList(list1));
        listOfTokenLists.add(new TokenList(list2));
        listOfTokenLists.add(new TokenList(list3));

        // Example: Filtering tokens in the first list for tokens containing "a"
        TokenList firstTokenList = listOfTokenLists.get(1);
        List<String> filteredTokens = firstTokenList.filterTokens("d");

        // Displaying the filtered tokens
        System.out.println("Filtered Tokens: " + filteredTokens);
    }

}
