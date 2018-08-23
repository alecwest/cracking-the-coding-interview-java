package stacksandqueues;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class SortStackTest {

    @Test
    public void sortStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(6);
        stack.push(3);
        stack.push(4);

        SortStack.sortStack(stack);
        assertEquals(1, (int)stack.peek());
        assertSorted(stack);
    }

    public static <T extends Comparable<? super T>> void assertSorted(Stack<T> stack) {
        Stack<T> compareStack = stack;
        if (stack.isEmpty()) return;
        T last = compareStack.pop();
        while (!compareStack.isEmpty()) {
            assertTrue(last.compareTo(compareStack.peek()) < 0);
            last = compareStack.pop();
        }
    }
}