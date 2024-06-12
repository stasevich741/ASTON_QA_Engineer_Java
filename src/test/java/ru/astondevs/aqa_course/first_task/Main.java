package ru.astondevs.aqa_course.first_task;

import ru.astondevs.aqa_course.first_task.animals.Cat;
import ru.astondevs.aqa_course.first_task.animals.Dog;
import ru.astondevs.aqa_course.first_task.food.BowlForFood;

public class Main {
    public static void main(String[] args) {

        Dog spark = new Dog();
        Dog skippy = new Dog();

        spark.run(150); //dog ran 150 meters
        spark.swim(15); //dog can't do that

        skippy.run(600); //dog can't do that
        skippy.swim(7); //dog swam 7 meters

        Cat tom = new Cat();
        Cat spot = new Cat();
        Cat jerry = new Cat();

        tom.run(150);  //cat ran 150 meters
        tom.swim(100); //cat can't swim

        BowlForFood bowl = new BowlForFood(1);
        bowl.addFood(15);

        Cat[] catsArray = {tom, spot, jerry};

        for (Cat cat : catsArray) {
            cat.eatFromBowl(bowl, 9);
            System.out.println(cat.satiety);
        }

    }
}
