package Sorting;

public class Sorting {

  private static boolean isOrdered(int[] array) {

    for (int i = 0; i < array.length - 1; i++) {
      if ((array[i] > array[i + 1])) {
        return false;
      }
    }
    return true;
  }

  protected static void assertIsSorted(int[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i - 1] > array[i]) {
        throw new RuntimeException("INPUT WAS NOT SORTED");
      }
    }

  }
}
