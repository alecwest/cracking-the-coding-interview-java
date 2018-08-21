package arraysandstrings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromePermutationTest {
    @Test
    public void palindromePermutation() {
        assertTrue(PalindromePermutation.palindromePermutation("atco cta"));
        assertTrue(PalindromePermutation.palindromePermutation("rraacce"));
        assertFalse(PalindromePermutation.palindromePermutation("thisisbad"));
    }
}