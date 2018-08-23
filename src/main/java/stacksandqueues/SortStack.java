package stacksandqueues;

import java.util.Stack;

public class SortStack {
    public static <T extends Comparable<? super T>> void sortStack(Stack<T> stack) {
        Stack<T> tempStack = new Stack<T>();
        while (!stack.isEmpty()) {
            T temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek().compareTo(temp) > 0) {
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

    }
}
