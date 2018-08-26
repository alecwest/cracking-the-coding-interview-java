package treesandgraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepths {
    public static <T> ArrayList<LinkedList<T>> listOfDepths(BTNode<T> btNode) {
        ArrayList<LinkedList<T>> nodesAtDepths = new ArrayList<>();
        listOfDepthsRecursive(btNode, 0, nodesAtDepths);
        return nodesAtDepths;
    }

    private static <T> void listOfDepthsRecursive(BTNode<T> currentNode, Integer depth, ArrayList<LinkedList<T>> nodesAtDepths) {
        if (currentNode == null) return;
        if (nodesAtDepths.size() == depth) nodesAtDepths.add(new LinkedList<>());
        nodesAtDepths.get(depth).add(currentNode.name);
        listOfDepthsRecursive(currentNode.leftNode, depth + 1, nodesAtDepths);
        listOfDepthsRecursive(currentNode.rightNode, depth + 1, nodesAtDepths);
    }

}
