package ru.astondevs.aqa_course.second_task.shape_interface;

public interface Figure {

    String getBackgroundColor();
    String getBorderColor();

    int getArea();
    int getPerimeter();

    default void printInfo() {
        System.out.println(getArea());
        System.out.println(getPerimeter());
        System.out.println(getBackgroundColor());
        System.out.println(getBorderColor());
    }
}
