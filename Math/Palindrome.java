package Math;

import java.util.Arrays;

public class Palindrome {

  public static void main(String[] args) {
    int[] inputs = {1001, 1, 2020};
    Arrays.stream(inputs).forEach(
      i -> System.out.printf("testing %d for primality: %b%n", i, isPalindrome(i))
    );
  }

  public static boolean isPalindrome(int n) {

    int m = n;
    int lastDigit = 0;
    int sum = 0;
    while (m > 0) {
      lastDigit = m % 10;
      m /= 10;
      sum = sum * 10 + lastDigit;
    }
    return (sum == n);
  }
}
