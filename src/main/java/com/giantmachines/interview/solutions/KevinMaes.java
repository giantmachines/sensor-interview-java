package com.giantmachines.interview.solutions;

import java.util.Arrays;

import com.giantmachines.interview.Planet;

public class KevinMaes {

    public static int[] findEvenElements(int[] input) {
        return Arrays.stream(input).filter(n -> n % 2 == 0).toArray();
    }

    public static double calculateAverage(int[] input) {
        double sum = Arrays.stream(input).reduce(0, (acc, n) -> acc + n);

        return sum / input.length;
    }

    public static int[] sortByNumber(int[] input) {
        return Arrays.stream(input).sorted().toArray();
    }

    public static Planet[] sortByName(Planet[] planets) {
        String[] sortIds = new String[planets.length];

        for (int i = 0; i < planets.length; i++) {
            Planet planet = planets[i];
            String name = planet.toString();
            char code = name.charAt(0);
            String id = String.valueOf(code) + ":" + String.valueOf(i);

            sortIds[i] = String.valueOf(id);
        }

        Object[] sorted = Arrays.stream(sortIds).sorted().toArray();

        Planet[] sortedPlanets = new Planet[sorted.length];

        for (int j = 0; j < sorted.length; j++) {
            String[] idParts = String.valueOf(sorted[j]).split(":");
            sortedPlanets[j] = planets[Integer.valueOf(idParts[1])];
        }

        return sortedPlanets;
    }

    public static double findMedian(int[] input) {
        int[] sorted = Arrays.stream(input).sorted().toArray();
        int middleIndex = sorted.length / 2;

        if (input.length % 2 == 0) {
            int sum = sorted[middleIndex - 1] + sorted[middleIndex];

            return (double) sum / 2;
        }

        double index = Math.floor(middleIndex);

        return sorted[(int) index];
    }

    public static double findMode(int[] input) {
        // sort the array.
        int[] sorted = Arrays.stream(input).sorted().toArray();

        int currentCount = 1;
        int highestCount = 0;
        int mostCommon = sorted[0];

        for (int i = 0; i < sorted.length; i++) {
            if (i == 0) {
                continue;
            }

            if (sorted[i] != sorted[i - 1]) {
                currentCount = 1; // New number, reset count.
            } else {
                currentCount++; // Same number, increment count of previous number.
            }

            // Check for new highest count.
            if (currentCount > highestCount) {
                highestCount = currentCount;
                mostCommon = sorted[i];
            }
        }

        return mostCommon;
    }

}
