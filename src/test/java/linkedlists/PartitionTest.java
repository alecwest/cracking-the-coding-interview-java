package linkedlists;

import org.junit.Test;

import static linkedlists.Helpers.assertLinkedListEquals;
import static org.junit.Assert.*;

public class PartitionTest {

    @Test
    public void partition() {
        Node<Integer> givenList = new Node<Integer>(3);
        givenList.appendToTail(5);
        givenList.appendToTail(8);
        givenList.appendToTail(5);
        givenList.appendToTail(10);
        givenList.appendToTail(2);
        givenList.appendToTail(1);
        Node<Integer> expectedList = new Node<Integer>(1);
        expectedList.appendToTail(2);
        expectedList.appendToTail(3);
        expectedList.appendToTail(5);
        expectedList.appendToTail(8);
        expectedList.appendToTail(5);
        expectedList.appendToTail(10);

        assertLinkedListEquals(expectedList, Partition.partition(givenList, 5));
    }
}