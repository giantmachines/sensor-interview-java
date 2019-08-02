import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FunctionsTest {

  @Test
  public void onlyEven() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int[] result = Functions.onlyEven(array);

    assertArrayEquals(new int[]{2, 4, 6, 8, 10}, result);
  }

  @Test
  public void mean() {
    int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

    double result = Functions.mean(array);

    assertEquals(8.8, result, 0);
  }

  @Test
  public void sortByNumber() {
    int[] array = {21, 3, 11, 4, 9, 19, 36, 18, 61, 55};

    int[] result = Functions.sortByNumber(array);

    assertArrayEquals(new int[]{3, 4, 9, 11, 18, 19, 21, 36, 55, 61}, result);
  }

  // @Test
  // public void sortByName() {
  //   Satellite mercury = new Satellite("Mercury");
  //   Satellite neptune = new Satellite("Neptune");
  //   Satellite jupiter = new Satellite("Jupiter");
  //   Satellite earth= new Satellite("Earth");
  //   Satellite[] array = {mercury, neptune, jupiter, earth};

  //   Satellite[] result = Functions.sortByName(array);

  //   assertArrayEquals(new Satellite[]{earth, jupiter, mercury, neptune}, result);
  // }

  @Test
  public void medianEvenLength() {
    int[] array = {5, 0, 1, 3, 1, 13, 8, 2};

    double result = Functions.median(array);

    assertEquals(2.5, result, 0);
  }

  @Test
  public void medianOddLength() {
    int[] array = {5, 0, 1, 3, 1, 8, 2};

    double result = Functions.median(array);

    assertEquals(2, result, 0);
  }

  @Test
  public void mode() {
    int[] array = {0, 1, 1, 3, 4, 5, 5, 6, 6, 6, 7, 8, 8, 9};

    double result = Functions.mode(array);

    assertEquals(6, result, 0);
  }

}
