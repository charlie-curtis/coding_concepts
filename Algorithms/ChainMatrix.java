public class ChainMatrix {

  public static void main(String[] args) {

    int n = 5;

    for (int l = 2; l <= n; l++) {

      for(int i = 1; i <= (n - l +1); i++) {

        int j = i + l -1;

        System.out.println("Now setting (" + i + "," + j + ") to infinity");
        
        for(int k = i; k <= j-1; k++) {
          System.out.println("Now checking (" + i + "," + k + ") and (" + (k+1) + "," + j + ")");

        }
      }
    }
  }
}
