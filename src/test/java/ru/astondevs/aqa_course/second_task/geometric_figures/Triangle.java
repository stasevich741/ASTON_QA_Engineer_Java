package ru.astondevs.aqa_course.second_task.geometric_figures;

public class Triangle extends AbstractFigure {

    private final int length;
    private final int height;
    private final int width;

    public Triangle(String backgroundColor, String borderColor, int length, int height, int width) {
        super(backgroundColor, borderColor);
        this.length = length;
        this.height = height;
        this.width = width;
    }

    @Override
    public int getArea() {
        int halfPerimeter = (length + height + width) / 2;
        return (int) Math.sqrt(halfPerimeter * (halfPerimeter - length) * (halfPerimeter - height) * (halfPerimeter - width));
    }

    @Override
    public int getPerimeter() {
        return length + height + width;
    }
}
