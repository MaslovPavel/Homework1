
import org.junit.*;
public class CountExactSymbolTest {
    @Test
    public void countExactSymbolTestUsualCase() {
        Assert.assertEquals(CountExactSymbol.countExactSymbol('a',"agbsdn saga afgahy"), 5);
    }

    @Test
    public void countExactSymbolTestIfStringIsNull() {
        Assert.assertEquals(CountExactSymbol.countExactSymbol('a', null), 0);
    }

    @Test
    public void countExactSymbolTestIfStringIsEmpty() {
        Assert.assertEquals(CountExactSymbol.countExactSymbol('a', ""), 0);
    }
}