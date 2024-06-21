package ru.astondevs.aqa_course.second_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private final HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String firstName, String phoneNumber) {
        if (!phoneBook.containsKey(firstName)) {
            phoneBook.put(firstName, new ArrayList<>());
        }
        phoneBook.get(firstName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }
}
