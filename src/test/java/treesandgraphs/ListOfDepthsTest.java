package treesandgraphs;

import org.junit.Test;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class ListOfDepthsTest {

    @Test
    public void listOfDepths() {
        BTNode<Integer> head = new BTNode<>(1);
        head.leftNode = new BTNode<>(2);
        head.rightNode = new BTNode<>(3);
        head.leftNode.rightNode = new BTNode<>(4);
        head.leftNode.rightNode.leftNode = new BTNode<>(5);
        head.leftNode.rightNode.rightNode = new BTNode<>(6);

        ArrayList<LinkedList<Integer>> result = ListOfDepths.listOfDepths(head);
        assertArrayEquals(new Integer[]{1}, result.get(0).toArray());
        assertArrayEquals(new Integer[]{2, 3}, result.get(1).toArray());
        assertArrayEquals(new Integer[]{4}, result.get(2).toArray());
        assertArrayEquals(new Integer[]{5, 6}, result.get(3).toArray());
    }
}