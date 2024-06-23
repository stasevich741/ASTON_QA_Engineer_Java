package ru.astondevs.aqa_course.tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.astondevs.aqa_course.FactorialCalculator;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculatorTest {

    @Test()
    @DisplayName("factorial for 5")
    void positiveFactorialTest() {
        assertEquals(FactorialCalculator.calculateFactorial(5), BigInteger.valueOf(120));
    }

    @Test()
    @DisplayName("factorial for 1")
    void FactorialForOneTest() {
        assertEquals(FactorialCalculator.calculateFactorial(1), BigInteger.ONE);
    }

    @Test()
    @DisplayName("factorial for 0")
    void FactorialForZeroTest() {
        assertEquals(FactorialCalculator.calculateFactorial(0), BigInteger.ONE);
    }


    @Test()
    @DisplayName("throws exception")
    void throwIllegalArgumentFactorialTest() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
    }
}
