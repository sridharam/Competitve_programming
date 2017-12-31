package hackeEarth;
import java.util.*;
import java.math.BigInteger;

public class SmallFactorials {

    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int n;
        for (int i = 0; i < N; i++) {
             n = s.nextInt();
            BigInteger factValue = BigInteger.ONE;
         
             for ( int j = 2; j <= n; j++){
                factValue = factValue.multiply(BigInteger.valueOf(j));
             }
         System.out.println(factValue);
        
        }
    
    }
	
		

      
}
