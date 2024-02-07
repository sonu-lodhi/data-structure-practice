package collectionframework.array;


import java.util.List;
import java.util.stream.Collectors;

public class TokenList {
    private List<String> tokens;

    public TokenList(List<String> tokens) {
        this.tokens = tokens;
    }

    public List<String> getTokens() {
        return tokens;
    }

    // Add any other methods or filters you need for token processing
    public List<String> filterTokens(String filter) {
        return tokens.stream()
                .filter(token -> token.contains(filter))
                .collect(Collectors.toList());
    }

}
