package linkedlists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Helpers {
    public static void assertLinkedListEquals(Node expected, Node actual) {
        assertEquals(expected.data, actual.data);
        while (expected.next != null ) {
            assertNotNull(actual.next);
            expected = expected.next;
            actual = actual.next;
            assertEquals(expected.data, actual.data);
        }
    }
}
