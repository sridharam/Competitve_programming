package hackeEarth;
import java.util.*;
// not done

public class N_c_17Costofarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		long a[] = new long[n];
		long b[] = new long[n];
		for(int i=0;i<n;i++) {
			a[i]= scan.nextLong();
		}
		long c[] = new  long[n];
		for(int i=0;i<n;i++) {
			b[i]= scan.nextLong();
			c[i] = b[i];
		}
		Arrays.sort(c);
		int m =scan.nextInt();
		long cost[][] = new long[m][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				cost[i][j]=scan.nextLong();
			}
		}
		long s=0;
		for(int i=0;i<n;i++) {
			s+=a[i]*b[i];
		}
		System.out.println(s);
	}

}
