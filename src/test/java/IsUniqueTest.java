import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueTest {

    @Test
    public void isUniqueNoHashTable() {
        assertFalse(IsUnique.isUniqueNoHashTable("blahtext"));
        assertTrue(IsUnique.isUniqueNoHashTable("blahText"));
        assertFalse(IsUnique.isUniqueNoHashTable("abc123defghijklmnopqrstuvwxyz123"));
    }

    @Test
    public void isUniqueHashTable() {
        assertFalse(IsUnique.isUniqueHashTable("blahtext"));
        assertTrue(IsUnique.isUniqueHashTable("blahText"));
        assertFalse(IsUnique.isUniqueHashTable("abc123defghijklmnopqrstuvwxyz123"));
    }

    @Test
    public void isUniqueHashMap() {
        assertFalse(IsUnique.isUniqueHashMap("blahtext"));
        assertTrue(IsUnique.isUniqueHashMap("blahText"));
        assertFalse(IsUnique.isUniqueHashMap("abc123defghijklmnopqrstuvwxyz123"));
    }
}