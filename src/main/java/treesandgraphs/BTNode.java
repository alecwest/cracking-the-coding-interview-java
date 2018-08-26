package treesandgraphs;

public class BTNode<T> {
    public T name;
    public BTNode<T> leftNode;
    public BTNode<T> rightNode;

    public BTNode(T name) {
        this.name = name;
    }
}
