package bitmanipulation;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairwiseSwapTest {

    @Test
    public void pairWiseSwap() {
        assertEquals(135, PairwiseSwap.pairWiseSwap(75));
        assertEquals(0, PairwiseSwap.pairWiseSwap(0));
        assertEquals(2, PairwiseSwap.pairWiseSwap(1));
        assertEquals(1, PairwiseSwap.pairWiseSwap(2));
        assertEquals(3, PairwiseSwap.pairWiseSwap(3));
    }
}