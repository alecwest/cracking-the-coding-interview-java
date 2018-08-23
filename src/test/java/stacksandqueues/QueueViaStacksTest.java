package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueViaStacksTest {
    private QueueViaStacks<Integer> queueViaStacks = new QueueViaStacks<>();

    @Test
    public void push() {
        queueViaStacks.push(1);
        queueViaStacks.push(2);
        queueViaStacks.push(3);
        assertFalse(queueViaStacks.addingStack.isEmpty());
        assertTrue(queueViaStacks.removingStack.isEmpty());
        assertEquals(3, (int) queueViaStacks.addingStack.peek());
    }

    @Test
    public void pop() {
        queueViaStacks.push(1);
        queueViaStacks.push(2);
        queueViaStacks.push(3);
        assertEquals(1, (int) queueViaStacks.pop());
        assertTrue(queueViaStacks.addingStack.isEmpty());
        assertFalse(queueViaStacks.removingStack.isEmpty());
    }

    @Test
    public void peek() {
        queueViaStacks.push(1);
        queueViaStacks.push(2);
        queueViaStacks.push(3);
        assertEquals(1, (int) queueViaStacks.peek());
        queueViaStacks.pop();
        assertEquals(2, (int) queueViaStacks.peek());
        queueViaStacks.push(4);
        assertEquals(2, (int) queueViaStacks.peek());
    }

    @Test
    public void isEmpty() {
        assertTrue(queueViaStacks.isEmpty());
        queueViaStacks.push(1);
        queueViaStacks.push(2);
        assertFalse(queueViaStacks.isEmpty());
        queueViaStacks.pop();
        queueViaStacks.pop();
        assertTrue(queueViaStacks.isEmpty());
    }
}