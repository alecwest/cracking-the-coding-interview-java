public class IsPermutation {
    public static boolean checkPermutation(String string1, String string2) {
        Integer string1CharSum = 0;
        Integer string2CharSum = 0;
        if (string1.length() != string2.length()) return false;
        for (int i = 0; i < string1.length(); i++) {
            string1CharSum += (int)string1.charAt(i);
            string2CharSum += (int)string2.charAt(i);
        }
        return string1CharSum.equals(string2CharSum);
    }
}
