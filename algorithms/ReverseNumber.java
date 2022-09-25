public class ReverseNumber {

  public static void main(String[] args) {

    System.out.println(reverseNumber(123456));
  }

  public static int reverseNumber(int n) {
  //Reverse a positive number w/o converting to str / char

    if (n < 10 ) {
      return n;
    }
    int upper = 10;

    while (upper < n) {
      //need to check for integer overflow here
      upper *= 10;
    }
      upper /= 10;

    int lastDigit = 0;
    int returnValue = 0;
    while (n > 0) {
      lastDigit = n % 10; 
      returnValue += (lastDigit * upper);
      upper /= 10;
      n /= 10;
    }
    return returnValue;
  }
}
