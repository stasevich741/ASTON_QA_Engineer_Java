package ru.astondevs.aqa_course;

import ru.astondevs.aqa_course.exceptions.MyArrayDataException;
import ru.astondevs.aqa_course.exceptions.MyArraySizeException;
import ru.astondevs.aqa_course.utils.ArrayUtils;

public class Main {
    public static void main(String[] args) {

        String[][] array1 = new String[4][4];
        String[][] array2 = new String[4][5];

        String[][] array3 = {
                {"1", "2", "3", "4" },
                {"5", "6", "7", "8" },
                {"9", "10", "11", "12" },
                {"13", "14", "15", "16" }
        };

        String[][] array4 = {
                {"1", "2", "3", "4" },
                {"5", "6", "7", "8" },
                {"9", "10", "11", "12" },
                {"13", "14", "i", "16" }
        };


        try {
            ArrayUtils.checkArray(array1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace(); // Wrong data in cell [0][0]
        }

        try {
            ArrayUtils.checkArray(array2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace(); // Size of array must be 4x4
        }

        try {
            ArrayUtils.checkArray(array3);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace(); //Sum of elements 136
        }

        try {
            ArrayUtils.checkArray(array4);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace(); //Wrong data in cell [3][2]
        }
    }
}

