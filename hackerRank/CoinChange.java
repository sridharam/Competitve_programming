//explanation:http://www.geeksforgeeks.org/dynamic-programming-set-7-coin-change/
package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CoinChange {

    static long getWays(long n, long[] S){
        long m= S.length;
        long[] way = new long[(int) (n+1)];
        Arrays.fill(way, 0);
        way[0] = 1;
        for (int i=0; i<m; i++)
            for (long j=S[i]; j<=n; j++) {
                way[(int) j] += way[(int) (j-S[i])];
                System.out.println("way["+j+"]    is "+way[(int) j]+" and s["+i+"] is "+S[i]);}
 
        return way[(int) n];
    }

    public static void main(String[] a) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
        

    }
}
