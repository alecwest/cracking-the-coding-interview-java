package linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnKthToLastTest {

    @Test
    public void returnKthToLast() {
        Node<Integer> givenHead = new Node<>(1);
        givenHead.appendToTail(2);
        givenHead.appendToTail(3);
        givenHead.appendToTail(4);
        givenHead.appendToTail(5);
        assertEquals(1, (int)ReturnKthToLast.returnKthToLast(givenHead, 5).data);
        assertEquals(2, (int)ReturnKthToLast.returnKthToLast(givenHead, 4).data);
        assertEquals(3, (int)ReturnKthToLast.returnKthToLast(givenHead, 3).data);
        assertEquals(4, (int)ReturnKthToLast.returnKthToLast(givenHead, 2).data);
        assertEquals(5, (int)ReturnKthToLast.returnKthToLast(givenHead, 1).data);
    }
}