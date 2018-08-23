package stacksandqueues;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueViaStacks<T> {
    // All elements should be in the adding stack prior to a push
    protected Stack<T> addingStack;
    // All elements should be in the removing stack prior to a pop
    protected Stack<T> removingStack;

    public QueueViaStacks() {
        addingStack = new Stack<>();
        removingStack = new Stack<>();
    }

    public void push(T item) {
        if (!removingStack.isEmpty()) flipToAdding();
        addingStack.push(item);
    }

    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        if (!addingStack.isEmpty()) flipToRemoving();
        return removingStack.pop();
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        if (!addingStack.isEmpty()) flipToRemoving();
        return removingStack.peek();
    }

    public boolean isEmpty() {
        return addingStack.isEmpty() && removingStack.isEmpty();
    }

    private void flipToAdding() {
        flip(removingStack, addingStack);
    }

    private void flipToRemoving() {
        flip(addingStack, removingStack);
    }

    private void flip(Stack<T> currStack, Stack<T> targetStack) {
        while (!currStack.isEmpty()) {
            targetStack.push(currStack.pop());
        }
    }
}
