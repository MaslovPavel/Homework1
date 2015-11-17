import org.junit.*;

public class MultiplyMatricesTest {
    @Test
    public void multiplyMatricesTestUsualCase(){
        boolean result = true;
        float[][] arrTest1 = {{1, 1, 1},
                              {2, 1, 0}};
        float[][] arrTest2 = {{0, 1},
                              {1, 1},
                              {0, 0}};
        float[][] arrAnswer = {{1, 2},
                               {1, 3}};
        float[][] newMatrix = MultiplyMatrices.multiplyMatrices(arrTest1, arrTest2);

        compare:
            for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < newMatrix[0].length; j++) {
                    if (newMatrix[i][j] != arrAnswer[i][j]) {
                        result = false;
                        break compare;
                    }
                }
            }
        Assert.assertTrue(result);
    }

    @Test
    public void multiplyMatricesTestIfNotMultipliable(){
        float[][] arrTest1 = {{1, 1},
                              {2, 1}};
        float[][] arrTest2 = {{0, 1},
                              {1, 1},
                              {0, 0}};
        float[][] newMatrix = MultiplyMatrices.multiplyMatrices(arrTest1, arrTest2);
        Assert.assertTrue(newMatrix == null);
    }

    @Test
    public void multiplyMatricesTestIfAnyMatrixIsNull(){
        float[][] newMatrix = MultiplyMatrices.multiplyMatrices(null, new float[][]{{0, 1}, {1, 1}, {0, 0}});
        Assert.assertTrue(newMatrix == null);
    }
}