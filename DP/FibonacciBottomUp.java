package DP;

public class FibonacciBottomUp {


  protected int computeFibonacciNumber(int n) {
    int fn_1 = 0;
    int fn_2 = 1;

    if (n == 0) return fn_1;
    if (n == 1) return fn_2;

    for (int i = 2; i <= n; i++) {
      int tmp = fn_1 + fn_2;
      fn_1 = fn_2;
      fn_2 = tmp;
    }
    return fn_2;
  }
}
