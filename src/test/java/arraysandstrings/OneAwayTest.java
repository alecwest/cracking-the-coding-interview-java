package arraysandstrings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OneAwayTest {

    @Test
    public void oneAway() {
        assertTrue(OneAway.oneAway("pale", "ple"));
        assertFalse(OneAway.oneAway("pale", "poles"));
        assertTrue(OneAway.oneAway("pales", "pale"));
        assertTrue(OneAway.oneAway("pale", "bale"));
        assertFalse(OneAway.oneAway("pale", "bake"));
        assertFalse(OneAway.oneAway("pale", "palace"));
    }
}