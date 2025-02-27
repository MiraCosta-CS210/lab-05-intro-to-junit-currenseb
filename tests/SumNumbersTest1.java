import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class SumNumbersTest1 { // edit

    @org.junit.jupiter.api.Test
    void addTest1() {

        SumNumbers sumNumbers1 = new SumNumbers();
        int result = sumNumbers1.sumIsEven(1, 1);
        assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void addTest2() {

        SumNumbers sumNumbers2 = new SumNumbers();
        int result = sumNumbers2.sumIsEven(1, 2);
        assertEquals(0, result);
    }

}