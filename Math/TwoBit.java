package Math;

import java.util.stream.IntStream;

//adds two integers together
public class TwoBit {

  public static void main(String[] args) {

    int[] num1 = {1, 0, 0, 1};
    int[] num2 = {1, 0, 0, 1};

    int[] result = addNumbers(num1, num2);

    IntStream.of(result).forEach(System.out::print);
  }


  public static int[] addNumbers(int[] num1, int[] num2) {

    int[] returnVal = new int[num1.length + 1];

    int carry = 0;
    int sum;
    for (int i = num1.length - 1; i >= 0; i--) {
      sum = carry + num1[i] + num2[i];
      returnVal[i] = sum % 2;
      carry = sum / 2;
    }
    //After the loop ends, fill in the last value
    returnVal[0] = carry;
    return returnVal;
  }
}
