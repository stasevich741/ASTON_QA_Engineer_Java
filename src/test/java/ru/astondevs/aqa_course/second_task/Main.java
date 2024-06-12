package ru.astondevs.aqa_course.second_task;

import ru.astondevs.aqa_course.second_task.geometric_figures.Circle;
import ru.astondevs.aqa_course.second_task.geometric_figures.Rectangle;
import ru.astondevs.aqa_course.second_task.geometric_figures.Triangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("red", "white", 12);
        Rectangle rectangle = new Rectangle("black", "yellow", 15, 22);
        Triangle triangle = new Triangle("purple", "green", 3, 6, 9);

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
