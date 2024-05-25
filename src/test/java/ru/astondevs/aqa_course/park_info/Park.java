package ru.astondevs.aqa_course.park_info;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private final List<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public void AddNewAttractionInfo(String attractionName, String workingHours, int cost) {
        attractions.add(new Attraction(attractionName, workingHours, cost));
    }

    public void AllAttractionInfo() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    private static class Attraction {
        private final String attractionName;
        private final String workingHours;
        private final int cost;

        public Attraction(String attractionName, String workingHours, int cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "attractionName='" + attractionName + '\'' +
                    ", workingHours='" + workingHours + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
}
