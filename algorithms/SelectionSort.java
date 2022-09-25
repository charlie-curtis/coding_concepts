public class SelectionSort {

  public static void main(String[] args) {

    int[] array = {10,11,17,18,99, 0, -3, 14, 8, 7, 107, 13, 1738, -999};
    int[] result = sort(array); 

    for (int i = 0; i< result.length; i++) {

      System.out.println(result[i]);
    }
  }

  public static int[] sort(int[] input) {
    
    if (input.length == 0) {
      //nothing to do here
      return input;
    }
    int min, minIndex;

    for (int i = 0; i < input.length-1; i++) {

      min = input[i];
      minIndex = i; 
      for(int j = i+1; j<input.length; j++) {
        if (input[j] < min) {
          min = input[j];
          minIndex = j; 
        }
      }
      input[minIndex] = input[i];
      input[i] = min;
    }
    return input;
  }
}
