package hackeEarth;
import java.util.*;
import java.math.*;
public class OctoberCircuits_Potential {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		int X[] = new int[n];
		int P[] = new int[n];//System.out.println("outside first for");
		for(int i=0;i<n;i++) {//System.out.println("inside for first");
			X[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++) {//System.out.println("inside for second");
			P[i] = scan.nextInt();
		}
		int option; int pos,value; int a,b;//System.out.println("after second for");
		for(int i=0;i<q;i++) {
			option = scan.nextInt();
			if(option==1) {
				pos = scan.nextInt();
				X[pos-1] = scan.nextInt();
			}
			else if(option==2) {
				pos = scan.nextInt();
				P[pos-1] = scan.nextInt();
			}
			else if(option==3) { int max=0;
				a = scan.nextInt();
				b = scan.nextInt();
				for(int j=a,k=0;k<n;j++,k++) {//System.out.println("k is "+k);
					 max =Math.max(max,X[k]+Math.min(P[k], j-a));
					 if(j==b) j--;
				}
				System.out.println(max);
			}
		}
		
	}

}
