package DP;

public class FibonacciBottomUpTest {

  public static void main(String[] args) {

    FibonacciBottomUp test = new FibonacciBottomUp();

    for (int i = 0; i <= 15; i++) {
      System.out.println("Fn(" + i + ") = " + test.computeFibonacciNumber(i));
    }

  }
}
