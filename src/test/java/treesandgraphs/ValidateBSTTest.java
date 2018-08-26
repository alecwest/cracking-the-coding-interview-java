package treesandgraphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateBSTTest {
    @Test
    public void validateBST() {
        BTNode<Integer> head = new BTNode<>(8);
        head.leftNode = new BTNode<>(4);
        head.leftNode.leftNode = new BTNode<>(2);
        head.leftNode.rightNode = new BTNode<>(6);
        head.rightNode = new BTNode<>(10);
        head.rightNode.rightNode = new BTNode<>(20);
        assertTrue(ValidateBST.validateBST(head));
    }

    @Test
    public void validateBSTFalse() {
        BTNode<Integer> head = new BTNode<>(8);
        head.leftNode = new BTNode<>(4);
        head.leftNode.leftNode = new BTNode<>(2);
        head.leftNode.rightNode = new BTNode<>(12);
        head.rightNode = new BTNode<>(10);
        head.rightNode.rightNode = new BTNode<>(20);
        assertFalse(ValidateBST.validateBST(head));
    }
}