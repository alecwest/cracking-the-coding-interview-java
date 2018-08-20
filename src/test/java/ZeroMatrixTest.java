import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ZeroMatrixTest {

    @Test
    public void zeroMatrix() {
        int[][] emptyArray = new int[][] {};
        assertMatrixEquals(emptyArray, ZeroMatrix.zeroMatrix(emptyArray));
        int[][] expectedArray = new int[][] {
                {1, 2},
                {3, 4}
        };
        int[][] givenArray = new int[][] {
                {1, 2},
                {3, 4}
        };
        assertMatrixEquals(expectedArray, ZeroMatrix.zeroMatrix(givenArray));
        expectedArray = new int[][] {
                {1, 0, 0, 4},
                {0, 0, 0, 0},
                {6, 0, 0, 3},
                {7, 0, 0, 4},
                {7, 0, 0, 4}
        };
        givenArray = new int[][] {
                {1, 2, 3, 4},
                {5, 0, 0, 2},
                {6, 5, 4, 3},
                {7, 6, 5, 4},
                {7, 6, 5, 4}
        };
        assertMatrixEquals(expectedArray, ZeroMatrix.zeroMatrix(givenArray));
        expectedArray = new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        givenArray = new int[][] {
                {0, 0, 0, 0, 0},
                {1, 2, 3, 4, 0}
        };
        assertMatrixEquals(expectedArray, ZeroMatrix.zeroMatrix(givenArray));
    }

    public static void assertMatrixEquals(int[][] expected, int[][] actual) {
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(Arrays.equals(expected[i], actual[i]));
        }
    }
}