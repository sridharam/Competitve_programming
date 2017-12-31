package hackeEarth;
import java.util.*;

public class OctoberCircuits_Replace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		int a[] = new int[n]; 
		
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		} int option;
		for(int i=0;i<q;i++) {
			option = scan.nextInt();
			int b[] = new int[2];
			if(option==1) {
				
				b[0] = scan.nextInt();
				b[1] = scan.nextInt();
				int find = scan.nextInt();
				int replaceWith = scan.nextInt();
				b[0]--;b[1]--;
				if(b[0]>b[1]) {int temp=b[0];b[0]=b[1];b[1] = temp;}
				for(int j=b[0];j<=b[1];j++) {
					if(a[j]==find)  a[j] =replaceWith;
				}
				
			} 
			else {
				int count=0;
				b[0] = scan.nextInt();
				b[1] = scan.nextInt();
				int find = scan.nextInt();
				b[0]--;b[1]--;
				if(b[0]>b[1]) {int temp=b[0];b[0]=b[1];b[1] = temp;}
				for(int j=b[0];j<=b[1];j++) {
					if(a[j]==find) count++;
				}
				System.out.println(count);
			}
		}

	}

}
