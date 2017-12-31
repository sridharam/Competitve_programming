package hackerRank;
import java.util.*;
// ans:https://www.hackerrank.com/contests/w35/challenges/highway-construction/editorial
import java.math.*;

public class WKOfCode35_HighwayConstruction {
	static int highwayConstruction(long n, int k) {
        int mod =1000000009;int total=0;
        for(int i=1;i<n-1;i++) {
        	total+=Math.pow(n-i, k)%mod;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long n = in.nextLong();
            int k = in.nextInt();
            int result = highwayConstruction(n, k);
            System.out.println(result);
        }
        in.close();
    }
}
