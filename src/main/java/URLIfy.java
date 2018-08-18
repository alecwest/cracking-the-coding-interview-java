public class URLIfy {
    public static String URLIfy(String givenString, Integer actualLength) {
        String resultString = givenString.trim();
        for (int i = actualLength - 1; i > 0; i--) {
            if (resultString.charAt(i) == ' ') {
                resultString = resultString.substring(0, i) + "%20" + resultString.substring(i + 1);
            }
        }
        return resultString;
    }
}
