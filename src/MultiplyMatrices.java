
public class MultiplyMatrices {
    public static float[][] multiplyMatrices(float[][] matrixLeft, float[][] matrixRight) {
        if (matrixLeft == null || matrixRight == null || matrixLeft[0].length != matrixRight.length) {
            return null;
        }

        float[][] result = new float[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    result[i][j] += matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        return result;
    }
}
