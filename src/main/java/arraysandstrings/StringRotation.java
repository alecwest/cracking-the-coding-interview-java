package arraysandstrings;

public class StringRotation {
    public static boolean stringRotation(String string1, String string2) {
        return (string1 + string1).contains(string2);
    }
}
