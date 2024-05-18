package ru.astondevs.aqa_course.utils;

public class PrintUtils {

    public static void printThreeWords() { //1
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    public static void printRepeatString(String stringToRepeat, int repeatCount) { //8
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(stringToRepeat);
        }
    }

    public static void printColor() { //3
        int value = 7;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 1 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
