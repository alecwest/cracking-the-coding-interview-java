package stacksandqueues;

import java.util.EmptyStackException;

public class StackMin<T extends Comparable<? super T>> {
    private static class StackNode<T> {
        private T data;
        private T stackMin;
        private StackNode<T> next;

        public StackNode (T data, T stackMin) {
            this.data = data;
            this.stackMin = stackMin;
        }
    }

    private StackNode<T> top;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> t;
        if (top == null || top.stackMin == null || item.compareTo(top.stackMin) < 0) {
            t = new StackNode<>(item, item);
        } else {
            t = new StackNode<>(item, top.stackMin);
        }
        t.next = top;
        top = t;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }
    
    public boolean isEmpty() {
        return top == null;
    }

    public T min() {
        return top.stackMin;
    }
}
