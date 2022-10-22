package DP;

import java.util.stream.IntStream;

public class EggDroppingProblemManyEggsTest {

  public static void main(String[] args) {

    EggDroppingProblemManyEggs test = new EggDroppingProblemManyEggs();
    IntStream.rangeClosed(0, 1000).forEach(
      i-> {
        int answer = test.getMinimumTosses(i, 3);
        System.out.printf("Floor: %d, tosses: %d%n", i, answer);
      }
    );
  }
}
