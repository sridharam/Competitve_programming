package codeChef;
import java.util.Scanner;
public class PERPALIN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i<T;i++) {
			int N = scan.nextInt();
			int P = scan.nextInt(); String p="";
			if(P==1||(P==2 && N==2)) { System.out.println("impossible");continue;}
			if(P%2==0) {
				for(int j=1;j<P+1;j++) {
					if(j==P/2 || j==P/2+1) p=p+'b';
					else p=p+'a';
				}
			}
			else {
				for(int j=1;j<P+1;j++) {
					if( j==P/2+1) p=p+'b';
					else p=p+'a';
				}
			}
			String s=p; int k=N/P;
			for(int j=1;j<k;j++) {
				s+=p;
			}
			System.out.println(s);
		}
	}

}
