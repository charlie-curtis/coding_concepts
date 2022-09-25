//multiply two base 10 numerals together
public class Q5 {
     public static void main(String[] args) {
	  int[] x = {0,2}; //20
	  int[] y = {3,1}; //13
	  int[] result = new int[2*x.length];
	  result =  gradeSchoolMultiply(x,y);
	  for (int i=result.length-1; i>=0; i--) {
	       System.out.print(result[i]);
	  }
     }
     public static int[] gradeSchoolMultiply(int[] x, int[] y) {
	  int sum = 0;
	  int[] returnMe = new int[2*x.length];
	  for (int j = 0; j<(2*x.length); j++) {
	       for (int i=0; i<x.length; i++) {
		    if ((0<= (j - i)) && ((j-i) < x.length)) {
			 sum += (x[i] * y[j-i]);
		    }
	       }
	  returnMe[j] = sum % 10; 
	  sum /= 10;

	  }
	  return returnMe;
     }
}
