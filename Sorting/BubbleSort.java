package Sorting;

public class BubbleSort {
  public static void sort(int[] input) {

    int temp;
    for (int i = 0; i < (input.length); i++) {

      for (int j = 0; j < (input.length - i - 1); j++) {

        if (input[j] > input[j + 1]) {
          temp = input[j];
          input[j] = input[j + 1];
          input[j + 1] = temp;
        }
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
