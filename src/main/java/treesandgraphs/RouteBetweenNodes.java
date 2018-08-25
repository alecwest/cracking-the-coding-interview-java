package treesandgraphs;

import java.util.ArrayList;

public class RouteBetweenNodes {
    public static <T> boolean routeBetweenNodes(Node<T> node1, Node<T> node2) {
        ArrayList<T> visitedNodes = new ArrayList<>();
        return depthFirstSearch(node1, node2, visitedNodes);
    }

    private static <T> boolean depthFirstSearch(Node<T> currentNode, Node<T> targetNode, ArrayList<T> visitedNodes) {
        for (Node<T> node: currentNode.children) {
            if (!visitedNodes.contains(node.name)) {
                visitedNodes.add(node.name);
                if (node.name.equals(targetNode.name)) return true;
                else return depthFirstSearch(node, targetNode, visitedNodes);
            }
        }
        return false;
    }
}
