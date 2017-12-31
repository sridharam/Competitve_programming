package hackerRank;//not complete
import java.util.*;
public class Knockknock {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		long [] r = new long[100000];
		r[0] = r[1]=r[2]=1;
		r[3] = r[4]=3;r[5]=r[6]=15;r[7] = r[8] = r[9]=r[10]=105;
		for(int i=0;i<T;i++) {
			int n = scan.nextInt();
			if(n<=10) {System.out.println(r[n]);continue;}
			r[n] = (long) Math.pow(2, Math.ceil(n/4))+r[(int) Math.ceil(n/5)]+r[(int)Math.ceil(n/10)];
			System.out.println(r[n]);
		}

	}

}
