import java.util.HashMap;
public class FibonacciMemoized {

	private HashMap<Integer, Long> memoPad = new HashMap<Integer, Long>();
	
	public long computeFibonacciNumber(int n){
		
		//base case
		if(n<=2)
		{
			return 1;
		}
		else{
			if(memoPad.containsKey(n))
			{
				return memoPad.get(n);
			}
		}
		long computedValue = computeFibonacciNumber(n-2) + computeFibonacciNumber(n-1);
		memoPad.put(n,computedValue);
		return computedValue;
	}
}
