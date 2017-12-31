package hackeEarth;
// 4 test case pass.
import java.util.*;
public class DC_17_LeftorRight {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Q = scan.nextInt();
		int a[] = new int[N];
		HashMap<Integer,Integer> hm1 = new HashMap<>();
		HashMap<Integer,Integer> hm2 = new HashMap<>();
		for(int i=0;i<N;i++) {
			a[i] = scan.nextInt();
			if(hm1.get(a[i])==null)
				hm1.put(a[i],i);
			else hm2.put(a[i], i);
		}
		while(Q-->0) {
			int y = scan.nextInt();
			int z = scan.nextInt();
			String dir= scan.next();
			if(hm1.get(z)==null) {
				System.out.println(-1);continue;
			}
			else if(hm1.get(z)==y) System.out.println(0);
			else {int ans; 
				if((dir.equals("R") && y>hm1.get(z)) || (dir.equals("L") && y<hm1.get(z))) {
				 ans =N-Math.abs(hm1.get(z)-y);
				 if(hm2.get(z)!=null) {
					ans = Math.min(ans, N-Math.abs(hm2.get(z)-y)) ;
				 }
				 }
				else {
				ans = Math.abs(hm1.get(z)-y);
				if(hm2.get(z)!=null) {
					ans = Math.min(ans, Math.abs(hm2.get(z)-y)) ;
				 }
				}
				System.out.println(ans);
			}
		}
	}

}
