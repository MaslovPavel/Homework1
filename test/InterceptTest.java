import org.junit.*;

public class InterceptTest {
    @Test
    public void interceptArraysTestHavingNotEmptyInterception() {
        Assert.assertEquals(Intercept.intercept(new double[] {1.25, 2.216, 5.1357},
                                         new double[] {5.1357, 1.3574, 0.32101, 1.25}),
                                         new Double[] {1.25, 5.1357});
    }

    @Test
    public void interceptArraysTestHavingEmptyInterception() {
        Assert.assertEquals(Intercept.intercept(new double[] {1.25, 2.216, 5.1357},
                                         new double[] {5.1311, 1.3574, 0.32101, 1.252}),
                                         new Double[] {});
    }

    @Test
    public void interceptArraysTestIfAnyArrayIsNull() {
        Assert.assertEquals(Intercept.intercept(null,
                                         new double[] {5.1311, 1.3574, 0.32101, 1.252}),
                                         new Double[] {});
    }

}