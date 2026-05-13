import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    public void testSub() {
        assertEquals(1, cal.sub(3, 2));
    }

    @Test
    public void testMul() {
        assertEquals(6, cal.mul(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(2, cal.div(6, 3));
    }
}
