package com.giantmachines.interview.solutions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        String[] ids = new String[planets.length];

        for (int i = 0; i < planets.length; i++) {
            Planet planet = planets[i];
            String name = planet.toString();
            int code = name.charAt(0);
            String id = String.valueOf(code) + ":" + String.valueOf(i);

            ids[i] = String.valueOf(id);
            System.out.println(id);
        }

        Object[] sorted = Arrays.stream(ids).sorted().toArray();

        Planet[] sortedPlanets = new Planet[sorted.length];

        for (int j = 0; j < sorted.length; j++) {
            String[] idParts = String.valueOf(sorted[j]).split(":");
            sortedPlanets[j] = planets[Integer.valueOf(idParts[1])];
        }

        return sortedPlanets;
    }

    public static double findMedian(int[] input) {
        int[] sorted = Arrays.stream(input).sorted().toArray();

        if (input.length % 2 == 0) {
            int index1 = sorted.length / 2 - 1;
            int index2 = sorted.length / 2;
            int sum = sorted[index1] + sorted[index2];

            return (double) sum / 2;
        }

        double index = Math.floor(sorted.length / 2);

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
                // Number has changed.
                currentCount = 1;
            } else {
                // Same as previous number.
                currentCount++;
            }

            // Evaluate this number's standing.
            if (currentCount > highestCount) {
                // New most common found.
                highestCount = currentCount;
                mostCommon = sorted[i];
            }
        }

        // System.out.println(highestCount);
        // System.out.println(mostCommon);

        return mostCommon;
    }

}
