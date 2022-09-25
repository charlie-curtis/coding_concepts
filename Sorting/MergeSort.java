import java.util.Arrays;


public class MergeSort extends Sorting {
	
	public static int[] sort(int[] array){
		
		if(array.length==1){
			return array;
		}
		int splitIndex = array.length/2;
			int[] left = sort(Arrays.copyOfRange(array, 0, splitIndex));
			
			int[] right = sort(Arrays.copyOfRange(array, splitIndex, array.length));
			
			return merge(left,right);
		
	}
	
	protected static int[] merge(int[] left, int[] right){
		
		int[] temp = new int[left.length + right.length];
		
		int rightIndex = 0 , leftIndex = 0;
		for(int i = 0; i<left.length+right.length; i++){
			
			//Make sure its not out of bounds
			if(rightIndex==right.length){
				temp[i] = left[leftIndex];
				leftIndex++;
			}
			//make sure its not out of bounds
			else if(leftIndex==left.length){
				temp[i] = right[rightIndex];
				rightIndex++;
			}
			else if(left[leftIndex] <= right[rightIndex]){
				temp[i] = left[leftIndex];
				leftIndex++;
			}
			else{
				temp[i] = right[rightIndex];
				rightIndex++;
			}
		}
		return temp;
	}

	public static void main(String[] args){
		
		int[] test = {3,10,5,9,103,-23,0,-1,-1,-2,-3,-4,-5};
		test = sort(test);
		if(isOrdered(test)){
			System.out.println("I am sorted");
		}
		else{
			System.out.println("I am NOT sorted");
		}
		for(int i = 0;i<test.length;i++){
			System.out.print(test[i]+",");
		}
	}
}
