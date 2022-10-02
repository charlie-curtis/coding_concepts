package ga_prep;

public class Iterating {

  public static void main(String[] args) {


    char[] letters = {'B', 'C', 'D', 'B', 'C', 'D', 'A'}; //BCDBCDA
    char[] letters2 = {'A', 'B', 'E', 'C', 'B', 'A', 'B'}; //ABECBAB


    //assume A is in the substring. find the position of A in the 2nd array.
    //assume B is in the substring. find the position of B in teh 2nd array

    //so each element needs to remember its current longest substring PLUS its position in the 2nd array

    //for now, assume that both inputs are the same size
    int[][] maxSubstring = new int[letters.length][letters.length];
    int[][] index = new int[letters.length][letters.length];
    for (int i = 0; i < index.length; i++) {
      for (int j = 0; j < index[i].length; j++) {
        index[i][j] = -1;
      }
    }

    //A[i] gives the index position in the 2nd array where B[i] was found where B[i] is the value in the first array
    int currentPosition;
    for (int i = 0; i < letters.length; i++) {
      for (int j = 0; j <= i; j++) {
        if (i == 6) {
          System.out.println("Now checking " + letters[i]);
        }
        if (i - 1 < 0) {
          if (i == 3) {
            System.out.println("Storing 0");
          }
          currentPosition = 0;
        } else {
          if (i == 6) {
            System.out.println("Storing " + index[i - 1][j]);
          }
          currentPosition = index[j][j - 1];
          if (currentPosition == -1) {
            //The character wasn't found in the other array, so you couldn't possibly
            //expand the longest sequence
            continue;
          }
          currentPosition++;
        }

        for (int k = currentPosition; k < letters2.length; k++) {
          if (i == 6) {
            System.out.println("checking if " + letters2[k] + " equals " + letters[i]);
          }
          if (letters2[k] == letters[i]) {
            System.out.println("Storing " + k + " for combo " + letters[j] + ", " + letters[i] + " because " + letters2[k] + " == " + letters[i]);
            index[i][j] = k;
            if (i - 1 < 0) {
              maxSubstring[i][j] = 1;
            } else {
              maxSubstring[i][j] = maxSubstring[i - 1][j] + 1;
            }
            break;
          }
        }
      }
    }

    for (int i = 0; i < letters.length; i++) {
      int maxValue = 0;
      for (int j = 0; j < letters.length; j++) {
        if (maxSubstring[i][j] > maxValue) {
          maxValue = maxSubstring[i][j];
        }
      }
      System.out.println("The maxsubstring beginning with " + letters[i] + " is " + maxValue);
    }
  }

/**
 *   A B C D
 * A 0
 * B 2 0
 * C 3 3 0
 * D 1 -1 -1
 *
 */

}
//[0,0],[0,1][0,2],[0,3]...[1,0]

//i = 3 j = 0 => i = 0, j =0
//i = 3 j = 1 => i = 1 j = 1
//i = 3 j = 2
//j value is fixed with whatever i'm evaluating. i increases by 1
//longest increasing common subsequence
/*
A
AB
ABC
ABD
ABCD
AC
ACD
AD


*/
