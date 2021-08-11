import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CreditCalculatorTest {
    private final CreditCalculator calculator = new CreditCalculator();
    private final int creditSum = 2_000_000;
    private final double creditRate = 13.990;
    private final int creditPeriod = 240;

    @Test
    void calculateSumPerMonth() {
        int expected = 24870;
        int actual = (int) calculator.calculateSumPerMonth(creditSum, creditRate, creditPeriod);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculateFullSumReturn() {
        int expected = 5_971_441;
        int actual = (int) calculator.calculateFullSumReturn(creditSum, creditRate, creditPeriod);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateOverPaySum() {
        int expected = 3_971_441;
        int actual = (int) calculator.calculateOverPaySum(creditSum, creditRate, creditPeriod);
        Assertions.assertEquals(expected, actual);
    }
}