package bitmanipulation;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlipBitToWinTest {

    @Test
    public void flipBitToWin() {
        assertEquals(8, FlipBitToWin.flipBitToWin(1775));
        assertEquals(6, FlipBitToWin.flipBitToWin(3023));
    }
}