package com.giantmachines.interview.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

import com.giantmachines.interview.Planet;

public class JohnnyAraujo {
  private static List<Integer> intArray2List(int[] input) {
    List<Integer> list = new ArrayList<Integer>();
    for (int elem : input) {
      list.add(elem);
    }
    return list;
  }

  public static int[] findEvenElements(int[] input) {
    // Lessons
    // - primitive data types cannot be assigned returns from wrapper methods
    // - arrays must be fixed length. use <List> or <ArrayList> for dynamic arrays
    // - only array types can be accessed via index. does not work on lists
    List<Integer> evenElements = new ArrayList<Integer>();
    for (int elem : input) {
      if (elem % 2 == 0) {
        evenElements.add(elem);
      }
    }
    // Not using stream api
    // Integer[] out = new Integer[evenElements.size()];
    // out = evenElements.toArray(out);

    // int[] finalOut = new int[out.length];

    // for (int idx = 0; idx < out.length; idx++) {
    // finalOut[idx] = out[idx];
    // }
    // return finalOut;

    // Stream API
    int[] finalOut = evenElements.stream().mapToInt(Integer::intValue).toArray();
    return finalOut;
  }

  public static double calculateAverage(int[] input) {
    List<Integer> numberList = intArray2List(input);
    Integer sum = numberList.stream().reduce(0, (a, b) -> a + b);
    return (double) sum / input.length;
  }

  public static int[] sortByNumber(int[] input) {
    List<Integer> numberList = intArray2List(input);
    int[] sortedArray = numberList.stream().sorted().mapToInt(Integer::intValue).toArray();
    return sortedArray;
  }

  public static Planet[] sortByName(Planet[] planets) {
    // Lesson: because Planet does not have a native "comparable", you need to
    // implement one using Comparator
    Arrays.sort(planets, Comparator.comparing(Planet::name));
    return planets;
  }

  public static double findMedian(int[] input) {
    Arrays.sort(input);
    boolean evenLength = input.length % 2 == 0;
    int middleRight = Math.floorDiv(input.length, 2);

    if (evenLength) {
      int middleLeft = middleRight - 1;
      double median = ((double) input[middleLeft] + input[middleRight]) / 2;
      return median;
    } else {
      return input[middleRight];
    }
  }

  public static double findMode(int[] input) {
    Map<String, Integer> modeTracker = new HashMap<String, Integer>();

    for (int i = 0; i < input.length; i++) {
      String numkey = Integer.toString(input[i]);
      if (modeTracker.containsKey(numkey)) {
        int oldFreq = modeTracker.get(numkey);
        int newFreq = oldFreq + 1;
        modeTracker.put(numkey, newFreq);

        if (newFreq > modeTracker.get("frequency")) {
          modeTracker.put("mode", input[i]);
          modeTracker.put("frequency", newFreq);
        }
      } else {
        modeTracker.put(numkey, 1);

        if (modeTracker.containsKey("mode") == false) {
          modeTracker.put("mode", input[i]);
          modeTracker.put("frequency", 1);
        }
      }
    }

    return modeTracker.get("mode");
  }

}
