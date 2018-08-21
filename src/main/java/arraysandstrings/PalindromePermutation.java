package arraysandstrings;

import java.util.HashMap;

public class PalindromePermutation {
    // assume spaces don't matter
    public static boolean palindromePermutation(String string) {
        int numChars = 0;
        HashMap<Character, Integer> numCharInstances = new HashMap<>();
        for (char c : string.toCharArray()) {
            if (c == ' ') continue;
            numCharInstances.put(c, numCharInstances.getOrDefault(c, 0) + 1);
            numChars++;
        }
        for (char c : numCharInstances.keySet()) {
            if (numCharInstances.get(c) % 2 != 0) {
                if (numChars % 2 != 0) {
                    numChars--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
