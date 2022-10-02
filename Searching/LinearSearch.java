package Sorting;

import java.util.stream.IntStream;

public class LinearSearch {

  protected static int search(int[] nums, int index) {

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == index) {
        return i;
      }

    }
    return -1;

  }

  public static void main(String[] args) {

    int[] test = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
    IntStream.of(test).forEach(
      i -> {
        int result = search(test, i);
        System.out.printf("Here was the result when searching with i=%d...%d%n", i, result);
      }
    );
  }

}
