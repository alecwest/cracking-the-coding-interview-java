package linkedlists;

public class Partition {
    public static Node<Integer> partition(Node<Integer> head, int partitionValue) {
        Node n = head;
        boolean partitionValueMet = false;
        while (n.next != null) {
            if ((int) n.next.data >= partitionValue) {
                if (!partitionValueMet) {
                    partitionValueMet = true;
                }
            }
            else {
                if (partitionValueMet) {
                    Node oldHead = head;
                    head = n.next;
                    n.next = n.next.next;
                    head.next = oldHead;
                }
            }
            n = n.next;
        }
        if ((int) n.data < partitionValue) {
            if (partitionValueMet) {
                Node oldHead = head;
                head = n;
                head.next = oldHead;
            }
        }
        return head;
    }
}
