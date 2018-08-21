package linkedlists;

import java.util.HashMap;

public class RemoveDups {
    public static <T> Node removeDups(Node<T> head) {
        Node<T> n = head;
        HashMap<T, Integer> dataCount = new HashMap<>();
        dataCount.put(n.data, 1);
        while (n.next != null) {
            Node<T> next = n.next;
            dataCount.put(next.data, dataCount.getOrDefault(next.data, 0) + 1);
            if (dataCount.get(next.data) > 1) {
                n.next = next.next;
            }
            n = n.next;
        }
        return head;
    }

    public static <T> Node<T> removeDupsNoHashMap(Node<T> head) {
        Node toCheck = head;
        Node n = toCheck.next;
        while (toCheck.next != null) {
            while (n.next != null) {
                if (n.next.data == toCheck.data) {
                    n.next = n.next.next;
                }
                n = n.next;
            }
            toCheck = toCheck.next;
            n = toCheck.next;
        }
        return head;
    }
}
