public class FibonacciBottomUpTest{

	public static void main(String[] args){

		FibonacciBottomUp test = new FibonacciBottomUp();

		for(int i = 1; i<=15; i++){

			System.out.println("Fn("+i+") = " + test.computeFibonacciNumber(i));
		}
			
	}
}