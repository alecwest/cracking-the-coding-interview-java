package linkedlists;

import org.junit.Test;

import static linkedlists.Helpers.assertLinkedListEquals;
import static org.junit.Assert.*;

public class RemoveDupsTest {

    @Test
    public void removeDups() {
        Node<Integer> givenHead = new Node<Integer>(1);
        givenHead.appendToTail(2);
        givenHead.appendToTail(3);
        givenHead.appendToTail(1);
        givenHead.appendToTail(4);
        givenHead.appendToTail(4);
        Node<Integer> expectedHead = new Node<Integer>(1);
        expectedHead.appendToTail(2);
        expectedHead.appendToTail(3);
        expectedHead.appendToTail(4);
        assertLinkedListEquals(expectedHead, RemoveDups.removeDups(givenHead));
    }

    @Test
    public void removeDupsNoHashMap() {
        Node<Integer> givenHead = new Node<Integer>(1);
        givenHead.appendToTail(2);
        givenHead.appendToTail(3);
        givenHead.appendToTail(1);
        givenHead.appendToTail(4);
        givenHead.appendToTail(4);
        Node<Integer> expectedHead = new Node<Integer>(1);
        expectedHead.appendToTail(2);
        expectedHead.appendToTail(3);
        expectedHead.appendToTail(4);
        assertLinkedListEquals(expectedHead, RemoveDups.removeDupsNoHashMap(givenHead));
    }
}