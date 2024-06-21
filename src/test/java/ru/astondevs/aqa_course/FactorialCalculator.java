package ru.astondevs.aqa_course;

import java.math.BigInteger;

public class FactorialCalculator {

    public static BigInteger calculateFactorial(int number) {
        if (number < 0) throw new IllegalArgumentException();

        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
