public class FibonacciBottomUp{


	protected int computeFibonacciNumber(int n){

			int fn_1 = 0;
			int fn_2 = 1; 
			if(n == 1 | n == 2){
				return 1;
			}
			for(int i = 2; i<n; i++){

				if(i%2 == 0){
					fn_1 = fn_1+fn_2;
				}
				else{
					fn_2 = fn_1+fn_2;
				}
			}
		return fn_1+fn_2;
	}
}