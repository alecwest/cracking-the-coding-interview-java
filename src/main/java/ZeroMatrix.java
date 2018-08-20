import java.util.ArrayList;

// O(m*n) time, O(max(m,n)) space
// TODO can be done in O(1) space
public class ZeroMatrix {
    public static int[][] zeroMatrix(int[][] matrix) {
        ArrayList<Integer> rowsToZero = new ArrayList<>();
        ArrayList<Integer> colsToZero = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (!rowsToZero.contains(j)) rowsToZero.add(j);
                    if (!colsToZero.contains(i)) colsToZero.add(i);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rowsToZero.contains(j) || colsToZero.contains(i)) matrix[i][j] = 0;
            }
        }

        return matrix;
    }
}
