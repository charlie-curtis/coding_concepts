package ga_prep;

public class longest_subsequence {

  public static void main(String[] args) {

    int[] numbers = {2, 2, 2, 2, 2};
    //int[] numbers = {7,6,5,4,3,2,1};
    longest_subsequence sol = new longest_subsequence();
    int result = sol.Solution(numbers);
    System.out.println();
    System.out.println();
    System.out.println(result);
    //1,2,3,4,7
    //1,2,4,5,7
    //1,2,3,5,7
    //index 5,4,4
  }

  private int Solution(int[] nums) {

    if (nums.length == 0) {
      return 0;
    }
    int[] max = new int[nums.length];
    int[] counts = new int[nums.length];
    max[0] = 1;
    int overallMax = 1;

    for (int i = 0; i < nums.length; i++) {
      max[i] = 1;
      counts[i] = 1;
      for (int j = i; j >= 0; j--) {
        if (nums[i] > nums[j]) {
          if ((max[j] + 1) > max[i]) {
            if (i == 6) {
              //System.out.println("adding 1 b/c " + (max[j] + 1) + " is greater than " + max[i] + ". j is " + j);
            }
            counts[i] = counts[j];
            max[i] = max[j] + 1;
          } else if ((max[j] + 1) == max[i]) {
            if (i == 6) {
              //System.out.println("adding 1 b/c " + (max[j] + 1) + "  equals " + max[i] + ". j is " + j);
            }
            counts[i] += counts[j];
          }
        }
      }
      if (max[i] > overallMax) {
        overallMax = max[i];
      }
    }
    //System.out.println("The overallMax is " + overallMax);
    int overallCount = 0;
    for (int i = 0; i < max.length; i++) {
      //System.out.println(max[i]);
      if (max[i] == overallMax) {
        overallCount += counts[i];
      }
    }
    return overallCount;
  }
}
