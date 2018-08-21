package arraysandstrings;

public class OneAway {
    public static boolean oneAway(String givenString, String targetString) {
        int lengthDifference = Math.abs(givenString.length() - targetString.length());
        if (lengthDifference > 1) return false;
        else {
            boolean differentCharFound = false;
            int i = 0;
            int j = 0;
            while (i < givenString.length() && j < targetString.length()) {
                if (givenString.charAt(i) != targetString.charAt(j) && !differentCharFound) {
                    differentCharFound = true;
                    if (givenString.length() > targetString.length()) {
                        i++;
                    } else if (givenString.length() < targetString.length()) {
                        j++;
                    }
                } else if (givenString.charAt(i) != targetString.charAt(j) && differentCharFound) {
                    return false;
                }
                i++;
                j++;
            }
        }
        return true;
    }
}
