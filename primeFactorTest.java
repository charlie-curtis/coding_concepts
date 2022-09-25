public class primeFactorTest {

public int minSteps(int n) {
    int res = 0;
    for(int i=2;i<=n;i++){
        while(n%i == 0){
            res+= i;
            n=n/i;
        }
    }
    return res;
}

    public static void main(String[] args) {
      
      primeFactorTest test = new primeFactorTest();
      System.out.println(test.minSteps(17));
      
    }

}
