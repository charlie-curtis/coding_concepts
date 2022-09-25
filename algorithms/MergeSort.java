public class MergeSort {

  public static void main(String[] args) {

    int[] array = {10,11,17,18,99, 0, -3, 14, 8, 7, 107, 13, 1738, -999};
    int[] retVal = sort(array);
    
    for(int i = 0; i< retVal.length; i++) {
      System.out.print(retVal[i] + " ");
    }
  }

  public static int[] sort(int[] input) {

    if (input.length <= 1) {
      return input;
    } 
     
    int rightSize = input.length/2;
    if (input.length % 2 == 1) {
      rightSize = input.length/2 + 1;
    }
    
    int[] left = new int[input.length/2];
    int[] right = new int[rightSize];
    
    for (int i = 0; i < input.length; i++) {

      if (i < input.length/2) {
        left[i] = input[i];
      } else {
        right[i - input.length/2] = input[i];
      }
    }
    int[] resultLeft = sort(left);
    int[] resultRight = sort(right);

    int maxVal = resultLeft.length;
    if (resultRight.length > maxVal) {
      maxVal = resultRight.length;
    }
    int rightCounter = 0;
    int leftCounter = 0;
    int[] mergeResult = new int[resultLeft.length + resultRight.length];
    while ((leftCounter + rightCounter) < (resultRight.length+resultLeft.length)) {
      if (leftCounter == resultLeft.length) {
        //left is full, default to right
        mergeResult[leftCounter + rightCounter] = resultRight[rightCounter];
        rightCounter++;
      }
      else if (rightCounter == resultRight.length) {
        //right is full, default to left 
        mergeResult[leftCounter + rightCounter] = resultLeft[leftCounter];
        leftCounter++;
      }
      else if (resultLeft[leftCounter] > resultRight[rightCounter]) {
        //use the right value
        mergeResult[leftCounter + rightCounter] = resultRight[rightCounter];
        rightCounter++;
      }
      else {
        //use the left value
        mergeResult[leftCounter + rightCounter] = resultLeft[leftCounter];
        leftCounter++;
      }
    }
    return mergeResult;
  }

}
