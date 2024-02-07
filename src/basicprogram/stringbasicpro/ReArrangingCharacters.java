package basicprogram.stringbasicpro;

public class ReArrangingCharacters {

        public static String rearrangeCharacters(String input) {
            char[] charArray = input.toCharArray();

            // Swap characters in pairs
            for (int i = 0; i < charArray.length - 1; i += 2) {
                char temp = charArray[i];
                charArray[i] = charArray[i + 1];
                charArray[i + 1] = temp;
            }

            return new String(charArray);
        }

        public static void main(String[] args) {
            // Example usage
            String input = "$%HJL%%GP";
            String output = rearrangeCharacters(input);

            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
        }


}
