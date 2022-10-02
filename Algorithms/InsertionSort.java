public class InsertionSort {

  public static void main(String[] args) {
    
    int[] array = {10,11,17,18,99, 0, -3, 14, 8, 7, 107, 13, 1738, -999};
    int[] retVal = sort(array);
    
    for(int i = 0; i< retVal.length; i++) {
      System.out.print(retVal[i] + " ");
    }

    int[] retVal2 = reverseSort(array);
    System.out.println();
    for(int i = 0; i< retVal2.length; i++) {
      System.out.print(retVal2[i] + " ");
    }
  }

  public static int[] sort(int[] input) {

    int current = 0;
    int temp = 0;
    int j = 0;
    for (int i = 1; i< input.length; i++) {

      current = input[i];
      j = i;
      while (j > 0 && input[j-1] > input[j]) {

        temp = input[j-1];
        input[j-1] = input[j];
        input[j] = temp;
        j--;
      }
    }
    return input;
  }

  public static int[] reverseSort(int [] input) {

    int j = 0;
    int temp = 0;
    for (int i = 1; i < input.length; i++ ) {

      j = i;
      while (j > 0 && input[j-1] < input[j]) {

        temp = input[j-1];
        input[j-1] = input[j];
        input[j] = temp;
        j--; 
      }
    }
    return input;
  }
}
