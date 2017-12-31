package codeChef;
import java.util.*;
public class CLRL {
	private static boolean validate(int[]a,boolean[] b) {
		int l = a.length;
		for(int i=1;i<l;i++) {
			for(int j=0;j<i;j++) {boolean c;
				if(a[j]<a[i]) c=true;
				else c =false;
				if(c==b[j])continue;
				else return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++) {
			int N = scan.nextInt(); int R = scan.nextInt();
			int[] a = new int[N];
			boolean[] b = new boolean[N];
			for(int j=0;j<N;j++) {
				a[j]=scan.nextInt();
				if(a[j]<R) b[j]=true;else if(a[j]>R) b[j]=false;
			}
			
			if(validate(a,b)==true) System.out.println("yes");
			else System.out.println("no");
		}
	}

}
