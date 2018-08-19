import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {

    @Test
    public void stringCompression() {
        assertEquals("", StringCompression.stringCompression(""));
        assertEquals("a2b1c5a3", StringCompression.stringCompression("aabcccccaaa"));
        assertEquals("abcdeff", StringCompression.stringCompression("abcdeff"));
    }

    @Test
    public void stringCompressionWithStringBuilder() {
        assertEquals("",
                StringCompression.stringCompressionWithStringBuilder(""));
        assertEquals("a2b1c5a3",
                StringCompression.stringCompressionWithStringBuilder("aabcccccaaa"));
        assertEquals("abcdeff",
                StringCompression.stringCompressionWithStringBuilder("abcdeff"));
    }
}