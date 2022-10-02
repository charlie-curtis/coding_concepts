package Recursion;

public class Math {

  public static void main(String[] args) {
    System.out.println(fastSum(10));
    System.out.println(recursiveSum(10));
    System.out.println(exponential(3, 5));
    System.out.println(exponential(3, 0));
  }

  /**
   * Adds all the numbers from 1 to n
   */
  public static int fastSum(int n) {
    return (n * (n + 1) / 2);
  }

  /**
   * Adds all the numbers from 1 to n
   */
  public static int recursiveSum(int n) {
    if (n == 0) {
      return 0;
    }
    return n + recursiveSum(n - 1);
  }

  /**
   * performs the math operation a^b
   */
  public static int exponential(int a, int b) {
    if (b == 0) {
      return 1;
    }

    return a * exponential(a, b - 1);
  }

}
