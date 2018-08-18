import java.util.HashMap;

public class IsPermutation {
    public static boolean checkPermutation(String string1, String string2) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        if (string1.length() != string2.length()) return false;
        for (int i = 0; i < string1.length(); i++) {
            hashMap.put(string1.charAt(i), hashMap.getOrDefault(string1.charAt(i), 0) + 1);
            hashMap.put(string2.charAt(i), hashMap.getOrDefault(string2.charAt(i), 0) - 1);
        }
        for (Character character: hashMap.keySet()) {
            if (hashMap.getOrDefault(character, -1) != 0) return false;
        }
        return true;
    }
}
