package com.giantmachines.interview.solutions;

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
        // int[] sorted = new ArrayList<Planet>();

        // return Collections.sort(planets, (a, b) -> a - b);
        // Planet[] planetsByName = Arrays.stream(planets).sorted().toArray();
        // System.out.println(String.valueOf(arr));
        return planets;
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
                currentCount = currentCount + 1;
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
