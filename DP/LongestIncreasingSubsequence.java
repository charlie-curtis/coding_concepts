package DP;

public class LongestIncreasingSubsequence {

  public static void main(String[] args) {

    //int[] numbers = {1, 2, 6, 7, 2, 3, 4, 5};
    int[] numbers = {1, 2, 3, 1, 2, 3};
    LongestIncreasingSubsequence sol = new LongestIncreasingSubsequence();
    int[] result = sol.Solution(numbers);

    System.out.printf("The longest increasing subsequence had a chain of %d and there are %d different ways to make that chain%n", result[0], result[1]);
  }

  private int[] Solution(int[] nums) {

    if (nums.length == 0) {
      int[] returnValue = { 0, 0 };
      return returnValue;
    }
    int[] max = new int[nums.length];
    int[] counts = new int[nums.length];
    int overallMax = 1;

    for (int i = 0; i < nums.length; i++) {
      max[i] = 1;
      counts[i] = 1;
      for (int j = i - 1; j >= 0; j--) {
        if (nums[i] > nums[j]) { //check to see if we can increase our longest subsequence
          if ((max[j] + 1) > max[i]) {
            //increased our subsequence. Reset the count
            counts[i] = counts[j];
            max[i] = max[j] + 1;
          } else if ((max[j] + 1) == max[i]) {
            //We tied our longest subsequence. Increase the count
            counts[i] += counts[j];
          }
        }
      }
      overallMax = Math.max(max[i], overallMax);
    }
    int overallCount = 0;
    for (int i = 0; i < max.length; i++) {
      if (max[i] == overallMax) {
        overallCount += counts[i];
      }
    }
    int[] answer = {overallMax, overallCount};
    return answer;
  }
}
