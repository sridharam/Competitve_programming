package hackeEarth;
// one pass. remaining tle
import java.util.*;
import java.math.*;//TLE EXCEPT one test case
public class N_c_17ShubhamandGCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int s[] = new int[N+1];s[0]=0;
		for (int i = 1; i <s.length; i++) {
			s[i]=scan.nextInt();
		}
		int a[] = new int[N+1];int count=0;
		long la = 1000000000000000000L;long lar=0L;
		System.out.println("init count= "+count);
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=1;i<s.length;i++) {
			for(int j=i;j<s.length;j++) {
				System.out.println("i= "+ i+" j="+j);
				String v=""+i+j;
				int m = GCD(i,j,s);
				if(m!=1) {if(i==j) lar++;
				if(lar>la){ System.out.println("-1");System.exit(0);}	
				hm.put(Integer.parseInt(v), 1);}
				else hm.put(Integer.parseInt(v), 0);
			}
		}System.out.println(count+" is count pre");
		
		for(int i=1;i<s.length;i++) {
			for(int j=i;j<s.length;j++) {
				if(i==j) continue;
				System.out.println("i= "+ i+" j="+j);int k=i,l=i;
				while(k<=j || l<=j) {
					System.out.println("l= "+ l+" k="+k);
					String v=""+l+k;
					int val=hm.get(Integer.parseInt(v));
					if(val==1) { lar++;
					if(lar>la){ System.out.println("-1");System.exit(0);}
					}
					if(k==j) {l++;k=l;continue;}
					k++;
				}
				System.out.println();
			}
		}
		if(lar>la) System.out.println(-1);
		else System.out.println(lar);
		System.out.println(hm);
		scan.close();
	}
	public static int GCD(int a,int b,int s[]) {
		//a=Integer.parseInt(s[a]);
		//b=Integer.parseInt(s[b]);
		a = s[a];b=s[b]; System.out.println("gcd a="+a+" b="+b);
		 if (a == 0)
		        return b;
		    if (b == 0)
		        return a;
		    if(a==1 ||b==1) return 1;
		 
		    int k;
		    for (k = 0; ((a | b) & 1) == 0; ++k)
		    {
		        a >>= 1;
		        b >>= 1;
		    }
		 
		    while ((a & 1) == 0)
		        a >>= 1;
		 
		    do
		    {
		        while ((b & 1) == 0)
		            b >>= 1;
		 
		        if (a > b) {
		        	int temp =a;
		        	a =b;
		        	b=temp;
		        }
		 
		        b = (b - a);
		    }   while (b != 0);
		 
		   
		    return a << k;
	}
		

}
