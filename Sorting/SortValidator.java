package Sorting;

public class SortValidator {
  protected void validate(int[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i - 1] > array[i]) {
        throw new RuntimeException("INPUT WAS NOT SORTED");
      }
    }

  }
}
