package ru.astondevs.aqa_course.second_task.geometric_figures;

public class Rectangle extends AbstractFigure {

    private final int length;
    private final int height;

    public Rectangle(String backgroundColor, String borderColor, int length, int height) {
        super(backgroundColor, borderColor);
        this.length = length;
        this.height = height;
    }

    @Override
    public int getArea() {
        return length * height;
    }

    @Override
    public int getPerimeter() {
        return 2 * (length + height);
    }
}
