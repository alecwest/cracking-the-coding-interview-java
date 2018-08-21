package linkedlists;

import org.junit.Test;

import static linkedlists.Helpers.assertLinkedListEquals;
import static org.junit.Assert.*;

public class DeleteMiddleNodeTest {

    @Test
    public void deleteMiddleNode() {
        Node<Integer> givenList = new Node<Integer>(1);
        givenList.appendToTail(2);
        givenList.appendToTail(3);
        givenList.appendToTail(4);
        givenList.appendToTail(5);
        Node<Integer> expectedList = new Node<Integer>(1);
        expectedList.appendToTail(2);
        expectedList.appendToTail(4);
        expectedList.appendToTail(5);

        DeleteMiddleNode.deleteMiddleNode(givenList.next.next);
        assertLinkedListEquals(expectedList, givenList);
    }
}