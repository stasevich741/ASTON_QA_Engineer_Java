package ru.astondevs.aqa_course.tests;

import org.testng.annotations.Test;
import ru.astondevs.aqa_course.FactorialCalculator;

import java.math.BigInteger;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialCalculatorTest {

    @Test
    void positiveFactorialTest() {
        assertEquals(FactorialCalculator.calculateFactorial(5), BigInteger.valueOf(120), "factorial for 5");
    }

    @Test
    void FactorialByOneTest() {
        assertEquals(FactorialCalculator.calculateFactorial(1), BigInteger.ZERO, "factorial for 5");
    }

    @Test
    void throwIllegalArgumentFactorialTest() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
    }
}
