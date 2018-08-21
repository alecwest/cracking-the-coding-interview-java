package linkedlists;

public class DeleteMiddleNode {
    public static void deleteMiddleNode(Node middleNode) {
        if (middleNode != null && middleNode.next != null) {
            middleNode.data = middleNode.next.data;
            middleNode.next = middleNode.next.next;
        }
    }
}
