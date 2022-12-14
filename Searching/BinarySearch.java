package Searching;

import java.util.stream.IntStream;

public class BinarySearch {


  public static int search(int[] nums, int start, int stop, int value) {

    int middleIndex = start + (stop - start) / 2;

    //base case; only 1 number in the array, check to see if its what you're looking for
    if (start == stop) {
      return (value == nums[middleIndex] ? middleIndex : -1);
    }
    if (nums[middleIndex] > value) {
      return (search(nums, start, middleIndex, value));
    } else if (nums[middleIndex] < value) {
      return (search(nums, middleIndex + 1, stop, value));
    }

    return middleIndex;


  }

  public static void main(String[] args) {

    int[] test = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
    IntStream.of(test).forEach(
      i -> {
        int result = search(test, 0, test.length - 1, i);
        System.out.printf("Here was the result when searching with i=%d...%d%n", i, result);
      }
    );
  }
}
