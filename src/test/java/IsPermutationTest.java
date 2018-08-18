import org.junit.Test;

import static org.junit.Assert.*;

public class IsPermutationTest {

    @Test
    public void checkPermutation() {
        assertTrue(IsPermutation.checkPermutation("racecar", "carrace"));
        assertTrue(IsPermutation.checkPermutation("Wleecats", "alecWest"));
        assertFalse(IsPermutation.checkPermutation("auehsont", "alecWest"));
    }
}