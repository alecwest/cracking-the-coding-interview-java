public class RotateMatrix {
    public static int[] rotateMatrix(int[] matrix) {
        int matrixSize = (int) Math.sqrt(((double) matrix.length));
        int layerDimensions = matrixSize;
        int startingXY = 0;
        while (layerDimensions > 0) {
            int nextX = startingXY;
            int nextY = startingXY;
            int replacedPixel;
            for (int j = 0; j < layerDimensions - 1; j++) {
                replacedPixel = matrix[nextX + (nextY * matrixSize)];
                for (int i = 0; i < 4; i++) {
                    int pixelToMove = replacedPixel;

                    // Swap
                    int temp = nextX;
                    nextX = matrixSize - nextY - 1;
                    nextY = temp;

                    replacedPixel = matrix[nextX + (nextY * matrixSize)];
                    matrix[nextX + (nextY * matrixSize)] = pixelToMove;
                }
                nextX++;
            }
            layerDimensions -= 2;
            startingXY++;
        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.print(matrix[i] + " ");
//            if (i % (matrixSize) == matrixSize - 1) {
//                System.out.println();
//            }
//        }
        return matrix;
    }
}
