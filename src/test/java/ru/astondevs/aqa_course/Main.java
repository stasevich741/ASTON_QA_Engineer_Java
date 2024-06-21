package ru.astondevs.aqa_course;

import ru.astondevs.aqa_course.first_task.CollectionUtils;
import ru.astondevs.aqa_course.second_task.PhoneBook;

public class Main {

    public static void main(String[] args) {

        String[] words = {
                "ten", "one", "two", "three", "four", "five",
                "one", "two", "three", "four", "five", "ten"
        };

        CollectionUtils.printUniqueWords(words);

        CollectionUtils.countWordsInArray(words);

        PhoneBook book = new PhoneBook();

        book.add("Tom", "+375 29 123 45 67");
        book.add("Antony", "+375 29 765 43 21");
        book.add("Tom", "+375 29 987 65 43");
        book.add("John", "+375 29 321 45 67");
        book.add("Antony", "+375 29 123 45 68");

        System.out.println("Tom "+ book.get("Tom"));
        System.out.println("Antony " + book.get("Antony"));
        System.out.println("John "+ book.get("John"));
        System.out.println("Uncle Bob "+ book.get("Uncle Bob"));
    }
}
