import static org.junit.Assert.assertEquals; // edit
import static org.junit.jupiter.api.Assertions.*;

public class TipCalculatorTest {

    @org.junit.jupiter.api.Test
    void addTest1() {

        TipCalculator tipCalc1 = new TipCalculator();
        double result1 = tipCalc1.calculateTip(100, 20);
        assertEquals(20, result1, .1);
    }

    @org.junit.jupiter.api.Test
    void addTest2() {

        TipCalculator tipCalc2 = new TipCalculator();
        double result2 = tipCalc2.calculateTip(67.56, 18);
        assertEquals(12.2, result2, .1);
    }
}
