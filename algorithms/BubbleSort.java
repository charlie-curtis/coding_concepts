public class BubbleSort {

  public static void main(String[] args) {
    
    int[] array = {999999,10,11,17,18,99, 0, -3, 14, 8, 7, 107, 13, 1738, -999};
    int[] retVal = sort(array);
    
    for(int i = 0; i< retVal.length; i++) {
      System.out.print(retVal[i] + " ");
    }

  }
  public static int[] sort(int[] input) {

    int temp;
    for (int i = 0; i < (input.length); i++) {

      for (int j = 0; j < (input.length -i -1); j++) {
       
        if (input[j] > input[j+1]) {
          temp = input[j];
          input[j] = input[j+1];
          input[j+1] = temp;
        } 
      }
    }
    return input;
  }
}
