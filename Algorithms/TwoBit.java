// Add two binary numbers together that are stored in an array of ints
// the most significant bit is stored in the first index of the array

public class TwoBit {

  public static void main(String[] args) {

    int[] num1 = {1,0,0,1};
    int[] num2 = {1,0,0,1};

    try{
      int[] result = addNumbers(num1, num2);
      for (int i = 0; i< result.length; i++) {
        System.out.println(result[i]);
      }
    } catch(Exception e) {
      System.out.println("you done messed up A-Aron");
    }
  }


  public static int[] addNumbers(int[] num1, int[] num2) throws Exception {

    if (num1.length != num2.length) {
      throw new Exception();
    }
    int [] returnVal = new int[num1.length + 1];

    int carry = 0;
    int sum = 0;
    for (int i = num1.length-1; i >= 0; i--) {

      sum = carry + num1[i] + num2[i];
      if (sum == 0) {
        returnVal[i+1] = 0;
        carry = 0;
      } else if (sum == 1) {
        returnVal[i+1] = 1;
        carry = 0;
      } else if (sum == 2) {
        returnVal[i+1] = 0;
        carry = 1;
      } else if (sum == 3) {
        returnVal[i+1] = 1;
        carry = 1;
      }
      sum = 0; 
    }
    //After the loop ends, fill in the last value
    returnVal[0] = carry;
    return returnVal;
  }
}
