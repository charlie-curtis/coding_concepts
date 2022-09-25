public class LinearSearch{

	protected static int search(int[] nums, int index){

		for(int i = 0; i<nums.length; i++){
			
			if(nums[i] == index){
				return i;
			}	

		}
		return -1;	
	
	}
	
	public static void main(String[] args){
	
		int[] test = {1,2,10,32,-1,38,-9,23,65,23,23,23,-4,7,10};
		int index = 23;
		int result = search(test, index);
		if(result != -1){
			System.out.println("Comparing " + index + " to " + test[result]);
		} 
	}

}
