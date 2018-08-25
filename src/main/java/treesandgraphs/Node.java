package treesandgraphs;

import java.util.ArrayList;

public class Node<T> {
    public T name;
    public ArrayList<Node> children;

    public Node(T name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
}
