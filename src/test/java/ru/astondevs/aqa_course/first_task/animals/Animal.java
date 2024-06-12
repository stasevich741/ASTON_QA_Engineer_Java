package ru.astondevs.aqa_course.first_task.animals;

public abstract class Animal {

    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    protected abstract void run(int distance);
    protected abstract void swim(int distance);
}
