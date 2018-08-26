package treesandgraphs;

import java.util.ArrayList;

public class RandomNode {
    public static <T> BTNode<T> randomNode(BTNode head) {
        ArrayList<BTNode<T>> nodes = new ArrayList<>();
        inorderTraversal(nodes, head);
        return nodes.get((int)(Math.random() * nodes.size()));
    }

    public static <T> void inorderTraversal(ArrayList<BTNode<T>> nodes, BTNode head) {
        if (head == null) return;
        inorderTraversal(nodes, head.leftNode);
        nodes.add(head);
        inorderTraversal(nodes, head.rightNode);
    }
}
