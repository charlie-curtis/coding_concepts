package Sorting;

public class SelectionSort {

  //java operates on the object themselves, so you don't have to return the array
  public static void sort(int[] array) {

    for (int i = 0; i < array.length - 1; i++) {
      int minValue = array[i];
      int replacementIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (minValue > array[j]) {
          minValue = array[j];
          replacementIndex = j;
        }
      }
      int temp = array[i];
      array[i] = minValue;
      array[replacementIndex] = temp;
    }
  }
  public static void main(String[] args) throws Exception {

    int[] test = {7, 3, 9, 4, 2, 0, 13, 28, 109, -3, -10, -17, -39};

    sort(test);

    SortValidator validator = new SortValidator();
    validator.validate(test);
  }

}
