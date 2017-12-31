package hackeEarth;
import java.util.*;
//not passing test cases 
public class NovemberCircuits17KilljMagicValue {
	static long fib[] = new long[2*1000000+1];
	static long fact[] = new long[2*1000000+1];
	static int mod =1000000007;
	static {
		fib[0] = fib[1] = 1;fact[0]=1;fact[1]=1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		 long p =0;
		for (int i = 0; i < T; i++) {p=0;
			int N = scan.nextInt();
			int M = scan.nextInt();
			long K = scan.nextLong();
			for(int j=N;j<=M;j++) {
				p=(p+(fib[j]*fact[j]%mod))%mod;
			}
			long x =  (p/K)%mod;
			System.out.println(x);
			
		}
		scan.close();
		ArrayList<Integer>a = new ArrayList<Integer>();
	}
	static {
		for(int i=2;i<=2000000;i++) {
			fib[i]=(fib[i-1]+fib[i-2])%mod;
		}
		
		
	}
	static {
		for(int i=2;i<=2000000;i++) {
			fact[i]=(i*fact[i-1])%mod;
			
		}
	}
	

}
