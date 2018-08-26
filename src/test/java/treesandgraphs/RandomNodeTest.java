package treesandgraphs;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class RandomNodeTest {

    @Test
    public void randomNode() {
        BTNode<Integer> btNode = new BTNode<>(8);
        btNode.leftNode = new BTNode<>(4);
        btNode.rightNode = new BTNode<>(9);
        btNode.leftNode.leftNode = new BTNode<>(2);
        btNode.leftNode.rightNode = new BTNode<>(6);
        btNode.rightNode.leftNode = new BTNode<>(7);
        btNode.leftNode.leftNode.leftNode = new BTNode<>(1);
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int result = (int) RandomNode.randomNode(btNode).name;
            occurrences.put(result, occurrences.getOrDefault(result, 0) + 1);
        }
        System.out.println(occurrences.toString());
        assertEquals(7, occurrences.keySet().size());
    }
}