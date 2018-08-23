package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackMinTest {

    @Test
    public void min() {
        StackMin<Integer> stack = new StackMin<>();
        stack.push(9);
        assertEquals(9, (int) stack.min());
        stack.push(10);
        assertEquals(9, (int) stack.min());
        stack.push(8);
        assertEquals(8, (int) stack.min());
        stack.push(11);
        assertEquals(8, (int) stack.min());
        stack.pop();
        assertEquals(8, (int) stack.min());
        stack.pop();
        assertEquals(9, (int) stack.min());
    }
}