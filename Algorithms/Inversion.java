public class Inversion {


  public static void main(String[] args) {
    int[] array = {10,11,17,18,99, 0, -3, 14, 8, 7, 107, 13, 1738, -999};

    int invCount = 0;
    for (int i = 0; i < array.length-1; i++ ) {

      for (int j = i+1; j < array.length; j++) {
        if (array[i] > array[j] ) {
          System.out.println(array[i] + " is greater than " + array[j]);
          invCount++;
        }
      }
    }

    System.out.println("There were " + invCount + " inversion that we encountered");
  }
}
