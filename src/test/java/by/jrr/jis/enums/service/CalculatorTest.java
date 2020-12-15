package by.jrr.jis.enums.service;

import org.junit.jupiter.api.Test;

import static by.jrr.jis.enums.service.Calculator.MINUS;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculate() {
        assertEquals(22.0, MINUS.calculate(34, 12));
    }
}
