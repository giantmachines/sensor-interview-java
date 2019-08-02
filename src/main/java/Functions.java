public  class Functions {

  public static int[] onlyEven(int[] array) {
    int evenIndex = 0;
    int[] temporaryArray = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        temporaryArray[evenIndex++] = array[i];
      } 
    }
    int[] evenArray = new int[evenIndex];
    System.arraycopy(temporaryArray, 0, evenArray, 0, evenIndex);
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
    return array;
  }

  public static Satellite[] sortByName(Satellite[] array) {
    return array;
  }

  public static double median(int[] array) {
    return 0;
  }

  public static double mode(int[] array) {
    return 0;
  }

}
