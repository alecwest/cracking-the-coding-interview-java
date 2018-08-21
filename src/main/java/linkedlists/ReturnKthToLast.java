package linkedlists;

import javafx.util.Pair;

public class ReturnKthToLast {
    public static <T> Node<T> returnKthToLast(Node<T> head, int kth) {
        return returnKthToLastRecursive(head, kth, 0, 1).getKey();
    }

    private static <T> Pair<Node<T>, Integer> returnKthToLastRecursive(Node<T> head, int kth, int currIndex, int listSize) {
        Pair nodeAndListSize = new Pair<Node<T>, Integer>(null, listSize);
        if (head.next != null) {
            nodeAndListSize = returnKthToLastRecursive(head.next, kth, currIndex + 1, listSize + 1);
        }
        if ((int) nodeAndListSize.getValue() - kth == currIndex) {
            return new Pair<Node<T>, Integer>(head, (int)nodeAndListSize.getValue());
        }
        return nodeAndListSize;
    }


}
