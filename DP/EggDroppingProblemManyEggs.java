package DP;
import java.util.HashMap;


/**
 * There are two eggs in this problem.
 */
public class EggDroppingProblemManyEggs {

  private final HashMap<Integer, HashMap<Integer, Integer>> memo = new HashMap<>();

  public int getMinimumTosses(int floors, int eggs) {

    if (floors == 0) return 0;
    if (floors == 1) return 1;
    if (eggs == 1) return floors; //if we only have 1 egg, we have to try every floor to make sure
    if (memo.containsKey(floors) && memo.get(floors).containsKey(eggs)) return memo.get(floors).get(eggs);


    int minValue = Integer.MAX_VALUE;
    for (int i = 1; i <= floors; i++) {
      //If the egg breaks on this floor, then we need to check from 1 to floors -1
      int optionA = getMinimumTosses(i-1, eggs - 1);
      //If the egg doesn't break, then we need to repeat the problem from i+1 to n
      int optionB = getMinimumTosses(floors - i, eggs);

      minValue = Math.min(minValue, 1 + Math.max(optionA, optionB));
    }
    HashMap<Integer, Integer> existingMap = memo.getOrDefault(floors, new HashMap<>());
    existingMap.put(eggs, minValue);
    memo.put(floors, existingMap);
    return memo.get(floors).get(eggs);
  }
}


