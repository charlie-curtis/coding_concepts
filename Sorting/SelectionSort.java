public class SelectionSort extends Sorting {

	//java operates on the object themselves, so you don't have to return the array
	public static void sort(int[] array){
	 
		for(int i = 0; i<array.length-1; i++){
			int minValue = array[i];
			int replacementIndex = i;
			for(int j = i+1; j<array.length; j++){
				if(minValue>array[j]){
					minValue = array[j];
					replacementIndex=j;
				}
			}
			int temp = array[i];
			array[i] = minValue;
			array[replacementIndex] = temp;
		}
	}
	
	public static void main(String[] args) throws Exception{

		int[] array1 = {11,7,9,4,2,0};
		sort(array1);
		if(isOrdered(array1)){
			System.out.println("I am sorted");
		}
		else{
			System.out.println("I am NOT sorted");
		}
	}
	
}
