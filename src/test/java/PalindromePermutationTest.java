import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationTest {
    @Test
    public void palindromePermutation() {
        assertTrue(PalindromePermutation.palindromePermutation("atco cta"));
        assertTrue(PalindromePermutation.palindromePermutation("rraacce"));
        assertFalse(PalindromePermutation.palindromePermutation("thisisbad"));
    }
}