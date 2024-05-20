package ru.astondevs.aqa_course;

import ru.astondevs.aqa_course.utils.ArrayUtils;
import ru.astondevs.aqa_course.utils.CompareUtils;
import ru.astondevs.aqa_course.utils.MathUtils;
import ru.astondevs.aqa_course.utils.PrintUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PrintUtils.printThreeWords(); //1
        PrintUtils.printColor(); //3
        PrintUtils.printRepeatString("hello", 3); //8

        CompareUtils.compareNumbers(); //4

        MathUtils.checkSumSign(); //2
        MathUtils.checkSumFromTenToTwenty(5, 6); //5
        MathUtils.checkPositiveOrNegative(5); //6
        System.out.println(MathUtils.checkIsYearLeap(2024)); //9

        ArrayUtils.invertArray(); //10
        ArrayUtils.fillArrayWithNumbers(); //11
        ArrayUtils.multiplyLessSixByTwo(); //12
        ArrayUtils.fillArrayByOnes(); //13
        System.out.println(Arrays.toString(ArrayUtils.arrayWithIntValue(3, 7))); //14
    }
}
