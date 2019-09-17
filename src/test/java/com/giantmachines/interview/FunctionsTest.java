package com.giantmachines.interview;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNull;

import java.util.Arrays;

import com.giantmachines.interview.solutions.KevinMaes;

public class FunctionsTest {

  @Test
  public void testFindEvenElements() {

    int[] input = { 1, 2, 3, 4, 6, 5, 7, 8, 9, 10 };

    int[] result = KevinMaes.findEvenElements(input);

    assertArrayEquals(new int[] { 2, 4, 6, 8, 10 }, result);
  }

  @Test
  public void testCalculateAverage() {

    int[] input = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };

    double result = KevinMaes.calculateAverage(input);

    assertEquals(8.8, result, 0);
  }

  @Test
  public void testSortByNumber() {

    int[] input = { 21, 3, 11, 4, 9, 19, 36, 18, 61, 55 };

    int[] result = KevinMaes.sortByNumber(input);

    assertArrayEquals(new int[] { 3, 4, 9, 11, 18, 19, 21, 36, 55, 61 }, result);
  }

  @Test
  public void testSortByName() {

    Planet[] planets = { Planet.MERCURY, Planet.NEPTUNE, Planet.JUPITER, Planet.EARTH };

    Planet[] result = KevinMaes.sortByName(planets);

    assertArrayEquals(new Planet[] { Planet.EARTH, Planet.JUPITER, Planet.MERCURY, Planet.NEPTUNE }, result);
  }

  @Test
  public void testFindMedian1() {

    int[] input = { 5, 0, 1, 3, 1, 13, 8, 2 };

    double result = KevinMaes.findMedian(input);

    assertEquals(2.5, result, 0);
  }

  @Test
  public void testFindMedian2() {

    int[] input = { 5, 0, 1, 3, 1, 8, 2 };

    double result = KevinMaes.findMedian(input);

    assertEquals(2, result, 0);
  }

  @Test
  public void testFindMode() {

    int[] input = { 0, 1, 1, 3, 4, 5, 5, 6, 6, 6, 7, 8, 8, 9 };

    double result = KevinMaes.findMode(input);

    assertEquals(6, result, 0);
  }

}
