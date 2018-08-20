import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {

    @Test
    public void stringRotation() {
        assertTrue(StringRotation.stringRotation("erbottlewat", "waterbottle"));
        assertFalse(StringRotation.stringRotation("erbottlewet", "waterbottle"));
        assertFalse(StringRotation.stringRotation("erbottlewat ", "waterbottle"));
    }
}