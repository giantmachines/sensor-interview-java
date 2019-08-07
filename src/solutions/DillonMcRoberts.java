public  class DillonMcRoberts {

  public static int[] onlyEven(int[] array) {
    int evenIndex = 0;
    int[] tempArray = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        tempArray[evenIndex++] = array[i];
      } 
    }
    int[] evenArray = new int[evenIndex];
    System.arraycopy(tempArray, 0, evenArray, 0, evenIndex);
    return evenArray;
  }

  public static double mean(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return (double) sum / (double) array.length;
  }

  public static int[] sortByNumber(int[] array) {
    boolean sorted = false;
    int tempSatellite;
    while (!sorted) {
      sorted = true;
      for (int i = 0; i < array.length -1; i++) {

        if (array[i] > array[i+1]) {
          tempSatellite = array[i];
          array[i] = array[i+1];
          array[i+1] = tempSatellite;
          sorted = false;
        }
      }
    }
    return array;
  }

  public static Satellite[] sortByName(Satellite[] array) {
    boolean sorted = false;
    Satellite tempSatellite;
    while (!sorted) {
      sorted = true;
      for (int i = 0; i < array.length -1; i++) {

        if ((int) array[i].name.charAt(0) > (int) array[i+1].name.charAt(0)) {
          tempSatellite = array[i];
          array[i] = array[i+1];
          array[i+1] = tempSatellite;
          sorted = false;
        }
      }
    }
    return array;
  }

  public static double median(int[] array) {
    int[] sortedArray = sortByNumber(array);
    int midIndex = sortedArray.length / 2;

    if (sortedArray.length % 2 != 0) {
      return sortedArray[midIndex];
    } 
    return (sortedArray[midIndex] + sortedArray[midIndex - 1]) / (double) 2;
  }

  public static double mode(int[] array) {
    int[] counts = new int[array.length];

    for(int i = 0; i < array.length; i++) {
      counts[array[i]]++;
    }

    int mode = counts[0];
    int modeIndex = 0;

    for(int i = 1; i < counts.length; i++) {
      if(counts[i] > mode) {
        mode = counts[i];
        modeIndex = i;
      }
    }
    return modeIndex;
  }
}
