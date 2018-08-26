package treesandgraphs;

import java.util.ArrayList;

public class BSTSequences {
    public static <T> ArrayList<ArrayList<T>> bstSequences(BTNode btNode) {
        ArrayList<ArrayList<T>> sequences = new ArrayList<>();
        if (btNode == null) {
            sequences.add(new ArrayList<>());
            return sequences;
        }

        ArrayList<T> prefix = new ArrayList<>();
        prefix.add((T)btNode.name);

        ArrayList<ArrayList<T>> leftSequences = bstSequences(btNode.leftNode);
        ArrayList<ArrayList<T>> rightSequences = bstSequences(btNode.rightNode);
        for (ArrayList<T> leftSequence : leftSequences) {
            for (ArrayList<T> rightSequence : rightSequences) {
                allSequences(sequences, leftSequence, rightSequence, prefix);
            }
        }
        return sequences;
    }

    public static <T> void allSequences(
            ArrayList<ArrayList<T>> allSequences,
            ArrayList<T> sequence1, ArrayList<T> sequence2, ArrayList<T> prefix) {
        if (sequence1.size() == 0 || sequence2.size() == 0) {
            ArrayList<T> result = (ArrayList<T>) prefix.clone();
            result.addAll(sequence1);
            result.addAll(sequence2);
            allSequences.add(result);
            return;
        }

        T headSequence1 = sequence1.remove(0);
        prefix.add(headSequence1);
        allSequences(allSequences, sequence1, sequence2, prefix);
        prefix.remove(prefix.size() - 1);
        sequence1.add(0, headSequence1);
        T headSequence2 = sequence2.remove(0);
        prefix.add(headSequence2);
        allSequences(allSequences, sequence1, sequence2, prefix);
        prefix.remove(prefix.size() - 1);
        sequence2.add(0, headSequence2);
    }
}
