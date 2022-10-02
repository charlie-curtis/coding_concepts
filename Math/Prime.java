package Math;

import java.util.Arrays;

public class Prime {

  public static void main(String[] args) {
    int[] inputs = {17, 43, 91, 7, 3, 41};

    Arrays.stream(inputs).forEach(i -> System.out.printf("%d primality: %b%n", i, isPrime(i)));

  }

  public static boolean isPrime(int n) {
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
