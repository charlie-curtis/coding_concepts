import java.util.ArrayList;
public class EggDroppingProblemTest {

	public static void main(String[] args){
		
		EggDroppingProblem test = new EggDroppingProblem();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i =0; i<1000;i++){
			System.out.println("floor: "+i+" , tosses: "+ test.getMinimumTosses(i));
		}
	}
}
