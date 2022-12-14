package Sorting;

public class InsertionSort {

  //java operates on the object themselves, so you don't have to return the array
  public static void sort(int[] array) {

    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      for (int j = i - 1; j >= 0 && array[j] > temp; j--) {
        array[i] = array[j];
        array[j] = temp;
      }
    }
  }

  public static void main(String[] args) throws Exception {

    int[] test = {7, 3, 9, 4, 2, 0, 13, 28, 109, -3, -10, -17, -39};

    sort(test);

    SortValidator validator = new SortValidator();
    validator.validate(test);
  }
}
