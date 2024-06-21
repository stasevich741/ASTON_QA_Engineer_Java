package ru.astondevs.aqa_course.tests;

import org.testng.annotations.Test;
import ru.astondevs.aqa_course.FactorialCalculator;

import java.math.BigInteger;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialCalculatorTest {


    @Test(description ="factorial for 5" )
    void positiveFactorialTest() {
        assertEquals(FactorialCalculator.calculateFactorial(5), BigInteger.valueOf(120));
    }

    @Test(description ="factorial for 1" )
    void FactorialForOneTest() {
        assertEquals(FactorialCalculator.calculateFactorial(1), BigInteger.ONE);
    }

    @Test(description = "factorial for 0")
    void FactorialForZeroTest() {
        assertEquals(FactorialCalculator.calculateFactorial(0), BigInteger.ONE);
    }


    @Test(description = "throws exception")
    void throwIllegalArgumentFactorialTest() {
        assertThrows( IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
    }
}
