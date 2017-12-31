package hackeEarth;
import java.util.*;
public class NovemberCircuits17TrianglesEverywhere {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		long dp[] = new long[1000000+1]; int mod =1000000007;
		dp[0] = 1;dp[1]=5; int curN=1;
		while(T-->0) {
			int N = scan.nextInt();
			if(N>curN) {
			for(int i=curN+1;i<=N;i++) {
				dp[i] = (dp[i-1]*3%mod+2)%mod;
			}
			}
			curN=N;
			System.out.println(dp[N]);
			
		}
	}

}
