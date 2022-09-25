//Proves that two algorithms are different simply by ignoring the ceiling of some inputs
import java.lang.Integer;
import java.lang.Math;
public class Q1 {
     public static void main(String[] args){
	  int size = 1000;
	  boolean[] primeNumbers1 = new boolean[size+1];
	  boolean[] primeNumbers2 = new boolean[size+1];
	  for (int i=2; i<= size; i++) {
	       if (isPrime(i, false)) {
		    primeNumbers1[i+1] = true;
	       }
	       if(isPrime(i, true)) {
		    primeNumbers2[i+1] = true;
	       } 
	  } 
	  int mismatch = 0;
	  for(int i=0; i<primeNumbers1.length; i++) {
	       if (primeNumbers1[i] != primeNumbers2[i]) {
		    mismatch++;
	       }
	  }
	  System.out.println("mismatches: " + mismatch);
     }
     public static boolean isPrime(int n, boolean useCeiling) {
	  int bits = Integer.bitCount(n);
	  int stopBits = 0;
	  if (useCeiling) {
	       stopBits = (int) Math.ceil((double) bits/2);
	  } else {
	       stopBits = bits/2;
	  }
	  int stop = (int) Math.pow(2, stopBits); 
	  for (int i=2; i<=stop; i++){
	       if(n % i == 0) {
		    return false;
	       }
	  }
	  return true;
     }
}
