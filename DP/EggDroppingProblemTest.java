package DP;

import java.util.stream.IntStream;

public class EggDroppingProblemTest {

  public static void main(String[] args) {

    EggDroppingProblem test = new EggDroppingProblem();
    IntStream.rangeClosed(0, 1000).forEach(
      i-> {
        int answer = test.getMinimumTosses(i);
        System.out.printf("Floor: %d, tosses: %d%n", i, answer);
      }
    );
  }
}
