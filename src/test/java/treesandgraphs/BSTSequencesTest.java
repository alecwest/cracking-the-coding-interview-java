package treesandgraphs;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BSTSequencesTest {

    @Test
    public void bstSequences() {
        BTNode<Integer> btNode = new BTNode<>(8);
        btNode.leftNode = new BTNode<>(4);
        btNode.rightNode = new BTNode<>(9);
        btNode.leftNode.leftNode = new BTNode<>(2);
        btNode.leftNode.rightNode = new BTNode<>(6);
        btNode.rightNode.leftNode = new BTNode<>(7);
        btNode.leftNode.leftNode.leftNode = new BTNode<>(1);
        ArrayList<ArrayList<Integer>> bstSequences = BSTSequences.bstSequences(btNode);
        for (ArrayList<Integer> sequence: bstSequences) {
            assertTrue(sequence.get(0).equals(8));
            assertTrue(sequence.indexOf(4) < sequence.indexOf(2));
            assertTrue(sequence.indexOf(2) < sequence.indexOf(1));
            assertTrue(sequence.indexOf(9) < sequence.indexOf(7));
            assertEquals(7, sequence.size());
        }
        System.out.println(bstSequences.toString());
        assertEquals(45, bstSequences.size());
    }

    @Test
    public void allSequences() {
        ArrayList<Integer> sequence1 = new ArrayList<>();
        ArrayList<Integer> sequence2 = new ArrayList<>();
        sequence1.add(4);
        sequence1.add(2);
        sequence1.add(1);
        sequence1.add(6);
        sequence2.add(9);
        sequence2.add(7);
        ArrayList<ArrayList<Integer>> allSequences = new ArrayList<>();
        BSTSequences.allSequences(allSequences, sequence1, sequence2, new ArrayList<>());
        for (ArrayList<Integer> sequence: allSequences) {
            assertTrue(sequence.indexOf(4) < sequence.indexOf(2));
            assertTrue(sequence.indexOf(4) < sequence.indexOf(6));
            assertTrue(sequence.indexOf(2) < sequence.indexOf(1));
            assertTrue(sequence.indexOf(1) < sequence.indexOf(6));
            assertTrue(sequence.indexOf(9) < sequence.indexOf(7));
            assertEquals(6, sequence.size());
        }
        assertEquals(15, allSequences.size());
    }
}