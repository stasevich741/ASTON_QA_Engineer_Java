package ru.astondevs.aqa_course.first_task.animals;

public class Dog extends Animal {

    private static int dogCount = 0;

    public Dog() {
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 500) {
            System.out.println("dog ran " + distance + " meters");
        } else System.out.println("dog can't do that");
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.println("dog swam " + distance + " meters");
        } else System.out.println("dog can't do that");
    }
}
