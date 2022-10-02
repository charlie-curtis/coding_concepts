package ga_prep;

public class palindromeNumber {
	
	public static void main(String[] args) {
		String result = "no";
		if (bitPalindrome(1001)) {
			result = "yes";
		}
		System.out.println(result);
	}
	
	public static boolean doStuff(int n) {
		
		int m = n;
		int lastDigit = 0;
		int sum = 0;
		while (m > 0) {
			lastDigit = m % 10;
			m /= 10;
			sum = sum*10 + lastDigit;
		}
		return (sum == n);
	}
	
	//1001
	
	public static boolean bitPalindrome(int n) {
		
		int newNumber = 0;
		int m = n;
		while (m > 0) {
			 if (m %2 == 1) {
				 System.out.print(1);
				 newNumber++;
			} else {
				System.out.print(0);
			}
			 newNumber = newNumber<<1;
			 m /=10;
			 
		}
		newNumber = newNumber>>1;
		System.out.println();
		System.out.println();
		System.out.println(newNumber);
		System.out.println(convertDecimal(n));
		return (newNumber == convertDecimal(n));
	}
	
	public static int convertDecimal(int bits) {
		int sum = 0;
		int offset = 1;
		while (bits > 0) {
			if (bits % 2 == 1) {
				sum = sum + offset;
			}
			offset *= 2;
			bits /= 10;
		}
		return sum;
	}

}
