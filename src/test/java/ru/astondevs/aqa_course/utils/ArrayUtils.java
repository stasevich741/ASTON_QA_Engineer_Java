package ru.astondevs.aqa_course.utils;

import ru.astondevs.aqa_course.exceptions.MyArrayDataException;
import ru.astondevs.aqa_course.exceptions.MyArraySizeException;

public class ArrayUtils {

    public static void checkArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Size of array must be 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Wrong data in cell [" + i + "][" + j + "]");
                }
            }
        }
        System.out.println("Sum of elements " + sum);
    }
}
