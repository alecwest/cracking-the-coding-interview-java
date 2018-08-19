import javafx.util.Pair;

import java.util.ArrayList;


public class StringCompression {
    public static String stringCompression(String givenString) {
        if (givenString.length() == 0) return givenString;
        ArrayList<Pair<Character, Integer>> charCountPairs = countConsecutiveChars(givenString);
        if (charCountPairs.size() * 2 >= givenString.length()) return givenString;
        return joinPairsToString(charCountPairs);
    }

    private static ArrayList<Pair<Character, Integer>> countConsecutiveChars(String givenString) {
        ArrayList<Pair<Character, Integer>> charCountPairs = new ArrayList<>();
        char lastChar = '\0';
        for (int i = 0; i < givenString.length(); i++) {
            if (givenString.charAt(i) != lastChar) {
                // Initialize
                charCountPairs.add(new Pair<Character, Integer>(givenString.charAt(i), 0));
            }
            lastChar = givenString.charAt(i);

            Pair<Character, Integer> activePair = charCountPairs.get(charCountPairs.size() - 1);
            // Increment
            charCountPairs.set(charCountPairs.size() - 1,
                    new Pair<Character, Integer>(activePair.getKey(), activePair.getValue() + 1));
        }
        return charCountPairs;
    }

    private static String joinPairsToString(ArrayList<Pair<Character, Integer>> charCountPairs) {
        String compressedString = "";
        for (int i = 0; i < charCountPairs.size(); i++) {
            compressedString += charCountPairs.get(i).getKey() + charCountPairs.get(i).getValue().toString();
        }
        return compressedString;
    }

    public static String stringCompressionWithStringBuilder(String givenString) {
        if (givenString.length() == 0) return givenString;
        StringBuilder builder = new StringBuilder();
        int numOccurrences = 0;
        int i = 0;
        while (i < givenString.length()) {
            numOccurrences++;
            if (i + 1 > givenString.length() - 1 || givenString.charAt(i) != givenString.charAt(i + 1)) {
                builder.append(givenString.charAt(i));
                builder.append(numOccurrences);
                numOccurrences = 0;
            }
            i++;
        }

        return builder.length() < givenString.length() ? builder.toString() : givenString;
    }
}
