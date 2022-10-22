package Sorting;

import java.util.Arrays;


public class MergeSort extends SortValidator {

  public static int[] sort(int[] array) {

    if (array.length == 1) {
      return array;
    }
    int splitIndex = array.length / 2;
    int[] left = sort(Arrays.copyOfRange(array, 0, splitIndex));

    int[] right = sort(Arrays.copyOfRange(array, splitIndex, array.length));

    return merge(left, right);

  }

  protected static int[] merge(int[] left, int[] right) {

    int[] temp = new int[left.length + right.length];

    int rightIndex = 0, leftIndex = 0;
    for (int i = 0; i < left.length + right.length; i++) {

      //Make sure its not out of bounds
      if (rightIndex == right.length) {
        temp[i] = left[leftIndex];
        leftIndex++;
      }
      //make sure its not out of bounds
      else if (leftIndex == left.length) {
        temp[i] = right[rightIndex];
        rightIndex++;
      } else if (left[leftIndex] <= right[rightIndex]) {
        temp[i] = left[leftIndex];
        leftIndex++;
      } else {
        temp[i] = right[rightIndex];
        rightIndex++;
      }
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
