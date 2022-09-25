import java.util.HashMap;
import java.lang.Math;
import java.util.ArrayList;


public class EggDroppingProblem {

	
	private HashMap<Integer,Integer> minTosses = new HashMap<Integer,Integer>();
	public int getMinimumTosses(int floors){
		
		ArrayList<Integer> valueHolder = new ArrayList<Integer>();
		for(int i = 1; i<= floors; i++){
			//egg breaks
			int case1 = (i-1);
			//egg doesn't break;
			int case2 = 0;
			
				if(minTosses.containsKey(floors-i)){
					if((floors-i) > 0 ){
						case2= minTosses.get(floors-i);
					}
					else{
						case2= 0;
					}
				}
				else{
						if( (floors-i)> 0){
						case2 = getMinimumTosses(floors-i);
						this.minTosses.put(floors-i, case2);
						}else{
							case2 = 0;
						}				
				}
			valueHolder.add(Math.max(case1+1, case2+1));
		}
		return minValueCalculator((valueHolder));
	}
	
	public int minValueCalculator(ArrayList<Integer> list){
		int minVal = list.size() > 0 ? list.get(0) : 0;
		for(int i = 0; i<list.size(); i++){
			if(list.get(i)< minVal){
				minVal = list.get(i);
			}
		}
		return minVal;
	}
}


