import java.util.HashMap;
import java.util.Hashtable;

public class IsUnique {
    public static boolean isUniqueNoHashTable(String chars) {
        for (int i = 0; i < chars.length(); i++) {
            for (int j = i + 1; j < chars.length(); j++) {
                if (chars.charAt(i) == chars.charAt(j)) return false;
            }
        }
        return true;
    }

    public static boolean isUniqueHashTable(String chars) {
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < chars.length(); i++) {
            if (hashtable.containsKey(chars.charAt(i))) return false;
            hashtable.putIfAbsent(chars.charAt(i), 1);
        }
        return true;
    }

    public static boolean isUniqueHashMap(String chars) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            if (hashMap.containsKey(chars.charAt(i))) return false;
            hashMap.putIfAbsent(chars.charAt(i), 1);
        }
        return true;
    }
}
