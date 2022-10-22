package DP;
import java.util.HashMap;


/**
 * There are two eggs in this problem.
 */
public class EggDroppingProblem {

  private final HashMap<Integer, Integer> memo = new HashMap<>();

  public int getMinimumTosses(int floors) {

    if (floors == 0) return 0;
    if (floors == 1) return 1;
    if (memo.containsKey(floors)) return memo.get(floors);


    int minValue = Integer.MAX_VALUE;
    for (int i = 1; i <= floors; i++) {
      //If the egg breaks on this floor, then we need to check from 1 to i-1 to figure out the exact floor
      int optionA = (i - 1);
      //If the egg doesn't break, then we need to repeat the problem from i to n
      int optionB = getMinimumTosses(floors - i);

      minValue = Math.min(minValue, 1 + Math.max(optionA, optionB));
    }
    memo.put(floors, minValue);
    return minValue;
  }
}


