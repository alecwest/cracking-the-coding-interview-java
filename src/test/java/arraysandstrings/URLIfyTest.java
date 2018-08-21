package arraysandstrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class URLIfyTest {

    @Test
    public void URLIfy() {
        assertEquals("Mr%20John%20Smith", URLIfy.URLIfy("Mr John Smith    ", 13));
    }
}