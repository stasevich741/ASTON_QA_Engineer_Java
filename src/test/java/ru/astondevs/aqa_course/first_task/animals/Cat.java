package ru.astondevs.aqa_course.first_task.animals;

import ru.astondevs.aqa_course.first_task.food.BowlForFood;

public class Cat extends Animal {

    private static int catCount = 0;
    public boolean satiety = false;

    public Cat() {
        catCount++;
    }

    public void eatFromBowl(BowlForFood bowlForFood, int foodToEat) {
        if (bowlForFood.getFoodAmount() >= foodToEat) {
            System.out.println("cat ate the food");
            satiety = true;
        } else {
            System.out.println("cat did not eat");
        }
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 200) {
            System.out.println("cat ran " + distance + " meters");
        } else System.out.println("cat can't do that");
    }

    @Override
    public void swim(int distance) {
        System.out.println("cat can't swim");
    }
}
