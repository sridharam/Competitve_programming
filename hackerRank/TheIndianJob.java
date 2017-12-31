package hackerRank;
import java.util.*;//not done
public class TheIndianJob {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0)
		{	int max=0; int sum=0;
			int N = scan.nextInt(); int G = scan.nextInt();
			int a[] = new int [N];
			for(int i=0;i<N;i++) {
				a[i] = scan.nextInt();sum+=a[i];
				if(a[i]>G) { max=1;}
			}
			if(max==1 || sum>2*G) { System.out.println("NO");continue;}
			else System.out.println("YES");
			
		}
	}

}
