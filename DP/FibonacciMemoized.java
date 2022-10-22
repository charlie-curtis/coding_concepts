package DP;

import java.util.HashMap;

public class FibonacciMemoized {

  private final HashMap<Integer, Long> memo = new HashMap<>();

  public long computeFibonacciNumber(int n) {

    if (n == 0) return 0;
    if (n <= 2) return 1;

    if (memo.containsKey(n)) return memo.get(n);

    memo.put(n, computeFibonacciNumber(n - 2) + computeFibonacciNumber(n - 1));
    return memo.get(n);
  }
}
