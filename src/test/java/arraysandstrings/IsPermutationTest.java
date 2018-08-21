package arraysandstrings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPermutationTest {

    @Test
    public void checkPermutation() {
        assertTrue(IsPermutation.checkPermutation("racecar", "carrace"));
        assertTrue(IsPermutation.checkPermutation("Wleecats", "alecWest"));
        assertFalse(IsPermutation.checkPermutation("aueehsont", "alecWest"));
        assertFalse(IsPermutation.checkPermutation("22", "13"));
    }
}