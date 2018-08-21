package arraysandstrings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class RotateMatrixTest {

    @Test
    public void rotateMatrix() {
        int[] emptyArray = new int[] {};
        assertTrue(Arrays.equals(emptyArray, RotateMatrix.rotateMatrix(emptyArray)));
        int[] expectedArray = new int[] {
                3, 1,
                4, 2
        };
        int[] givenArray = new int[] {
                1, 2,
                3, 4
        };
        assertTrue(Arrays.equals(expectedArray, RotateMatrix.rotateMatrix(givenArray)));
        expectedArray = new int[] {
                7, 6, 5, 1,
                6, 5, 4, 2,
                5, 4, 3, 3,
                4, 3, 2, 4
        };
        givenArray = new int[] {
                1, 2, 3, 4,
                5, 4, 3, 2,
                6, 5, 4, 3,
                7, 6, 5, 4
        };
        assertTrue(Arrays.equals(expectedArray, RotateMatrix.rotateMatrix(givenArray)));
        expectedArray = new int[] {
                7, 6, 5, 1, 0,
                6, 5, 4, 2, 0,
                5, 4, 3, 3, 0,
                4, 3, 2, 4, 0,
                0, 0, 0, 0, 0
        };
        givenArray = new int[] {
                0, 0, 0, 0, 0,
                1, 2, 3, 4, 0,
                5, 4, 3, 2, 0,
                6, 5, 4, 3, 0,
                7, 6, 5, 4, 0
        };
        assertTrue(Arrays.equals(expectedArray, RotateMatrix.rotateMatrix(givenArray)));
    }
}