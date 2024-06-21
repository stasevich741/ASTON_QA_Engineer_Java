package ru.astondevs.aqa_course.first_task;

import java.util.*;

public class CollectionUtils {

    public static void printUniqueWords(String[] wordsToCheck) {
        Set<String> uniqueWords = new HashSet<>(List.of(wordsToCheck));
        System.out.println(uniqueWords);
    }

    public static void countWordsInArray(String[] wordsToCount) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : wordsToCount) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("The number of each word");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
