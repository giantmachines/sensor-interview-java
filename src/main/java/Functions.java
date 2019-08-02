public  class Functions {

  public static int[] onlyEven(int[] array) {
    int evenIndex = 0;
    int[] tmpArray = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        tmpArray[evenIndex++] = array[i];
      } 
    }
    int[] evenArray = new int[evenIndex];
    System.arraycopy(tmpArray, 0, evenArray, 0, evenIndex);
    return evenArray;
  }

  public static double mean(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum / (double) array.length;
  }

  public static int[] sortByNumber(int[] array) {
    boolean sorted = false;
    int tmp;
    while (!sorted) {
      sorted = true;
      for (int i = 0; i < array.length -1; i++) {
        if (array[i] > array[i+1]) {
          tmp = array[i];
          array[i] = array[i+1];
          array[i+1] = tmp;
          sorted = false;
        }
      }
    }
    return array;
  }

  public static Satellite[] sortByName(Satellite[] array) {
    return array;
  }

  public static double median(int[] array) {
    int[] sortedArray = sortByNumber(array);
    int midIndex = sortedArray.length / 2;
    System.out.println(midIndex);
    if (sortedArray.length % 2 != 0) {
      return sortedArray[midIndex];
    } 
    return (sortedArray[midIndex] + sortedArray[midIndex - 1]) / (double) 2;
  }

  public static double mode(int[] sortedArray) {
    return 0;
  }

}
