package ru.astondevs.aqa_course.utils;

import java.util.Arrays;

public class ArrayUtils {

    public static void multiplyLessSixByTwo() { //12
        int[] arrayToMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrayToMultiply));

        for (int i = 0; i < arrayToMultiply.length; i++) {
            if (arrayToMultiply[i] < 6)
                arrayToMultiply[i] *= 2;
        }
        System.out.println(Arrays.toString(arrayToMultiply));
    }

    public static void fillArrayByOnes() { //13
        int[][] arrayToFill = new int[3][3];
        for (int i = 0; i < arrayToFill.length; i++) {
            arrayToFill[i][i] = 1;
        }
        System.out.println(Arrays.deepToString(arrayToFill));
    }

    public static int[] arrayWithIntValue(int length, int value) { //14
        int[] arrayToReturn = new int[length];
        Arrays.fill(arrayToReturn, value);
        return arrayToReturn;
    }

    public static void invertArray() { //10
        int[] arrayToInvert = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arrayToInvert));

        for (int i = 0; i < arrayToInvert.length; i++) {
            arrayToInvert[i] = arrayToInvert[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(arrayToInvert));
    }

    public static void fillArrayWithNumbers() { //11
        int[] arrayToFill = new int[100];
        for (int i = 0; i < arrayToFill.length; i++) {
            arrayToFill[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayToFill));
    }

}
