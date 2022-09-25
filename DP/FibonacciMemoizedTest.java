
public class FibonacciMemoizedTest {

	public static void main(String[] args){
		
		FibonacciMemoized object = new FibonacciMemoized();

		for(int i = 0; i<=15; i++){
			System.out.println("Fn(" +i+") = "+object.computeFibonacciNumber(i));
		}
	}
}
