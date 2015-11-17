import org.junit.Test;
import static org.junit.Assert.*;

public class CheckEqualsTest {
    @Test
    public void CheckEqualsTestCouldReturnTrue(){
        assertTrue(CheckEquals.checkEquals(new String[] {"asdf", "abdf", "a", "", "a"}));
    }

    @Test
    public void CheckEqualsTestCouldReturnFalse(){
        assertFalse(CheckEquals.checkEquals(new String[]{"asdf", "abdf", "a", "", "b"}));
    }

    @Test
    public void CheckEqualsTestIfArrayIsNull(){
        assertFalse(CheckEquals.checkEquals(null));
    }
}