package com.giantmachines.interview.solutions;

import java.util.Arrays;

// import com.giantmachines.interview.Planet;s

public class KevinMaes {

    public static int[] findEvenElements(int[] input) {
        return Arrays.stream(input).filter(n -> n % 2 == 0).toArray();
    }

    public static double calculateAverage(int[] input) {
        double sum = Arrays.stream(input).reduce(0, (acc, n) -> acc + n);

        return sum / input.length;
    }

    public static int[] sortByNumber(int[] input) {
        return input;
    }

    // public static Planet[] sortByName(Planet[] planets) {
    // return planets;
    // }

    public static double findMedian(int[] input) {
        return 0;
    }

    public static double findMode(int[] input) {
        return 0;
    }

}
