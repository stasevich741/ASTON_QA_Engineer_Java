package ru.astondevs.aqa_course.utils;

public class MathUtils {

    public static boolean checkIsYearLeap(int yearToCheck) { //9
        return (yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0);
    }

    public static void checkSumSign() { //2
        int a = 7;
        int b = 7;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static boolean checkSumFromTenToTwenty(int firstNumber, int secondNumber) { //5
        int sum = firstNumber + secondNumber;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkPositiveOrNegative(int numberToCheck) { //6
        if (numberToCheck >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkPositiveOrNegativeBoolean(int numberToCheck) { //7
        return numberToCheck < 0;
    }
}
