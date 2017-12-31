package hackeEarth;
import java.util.*;
public class OctoberCircuits_CardGame {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int m = scan.nextInt();
		int b[] = new int[m];
		int max =0;
		for(int i=0;i<m;i++) {
			b[i]=scan.nextInt();
			if(b[i]>max)	max = b[i];
		}
		max++; int money=0;
		for(int i=0;i<n;i++) {
			if(a[i]<max) money+=max-a[i];
		}
		System.out.println(money);
		
	}

}
