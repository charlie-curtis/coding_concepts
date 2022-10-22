package Sorting;

import java.util.Arrays;

public class MergeSort {

  public static void sort(int[] array) {
    int[] sortedInput = sortHelper(array);
    //we're doing this because we want to manipulate the input array itself, and mergesort operates on copies
    //of the array
    for (int i = 0; i < sortedInput.length; i++) {
      array[i] = sortedInput[i];
    }
  }

  private static int[] sortHelper(int[] array) {
    if (array.length == 1) {
      return array;
    }
    int splitIndex = array.length / 2;
    int[] left = sortHelper(Arrays.copyOfRange(array, 0, splitIndex));

    int[] right = sortHelper(Arrays.copyOfRange(array, splitIndex, array.length));

    return merge(left, right);
  }

  protected static int[] merge(int[] left, int[] right) {

    int[] temp = new int[left.length + right.length];

    int rightIndex = 0, leftIndex = 0;
    for (int i = 0; i < left.length + right.length; i++) {

      int rightOption = rightIndex < right.length ? right[rightIndex] : Integer.MAX_VALUE;
      int leftOption = leftIndex < left.length ? left[leftIndex] : Integer.MAX_VALUE;

      temp[i] = Math.min(rightOption, leftOption);

      //increment whichever pointer we just used
      if (temp[i] == rightOption) rightIndex++;
      else leftIndex++;

    }
    return temp;
  }

  public static void main(String[] args) throws Exception {

    int[] test = {7, 3, 9, 4, 2, 0, 13, 28, 109, -3, -10, -17, -39};

    sort(test);

    SortValidator validator = new SortValidator();
    validator.validate(test);
  }
}
