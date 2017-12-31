package hackeEarth;
import java.util.*;
// 19/25 pass.  remaining tle
import java.io.*;
public class DC_17_LeftorRight_New {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String str = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int[] a = new int[N];
        str = br.readLine().trim();
        st = new StringTokenizer(str);
		HashMap<Integer,String> hm = new HashMap<>(); // string will store duplicate values like s = 1 2 3 4 ;
        for(int i=0;i<N;i++) {
        	a[i]=Integer.parseInt(st.nextToken()); String s =""+i;
        	hm.put(a[i], hm.get(a[i])==null?s:hm.get(a[i])+" "+s);
        } System.out.println(hm);
        while(Q-->0) { int count=1;
        	str = br.readLine().trim();
            st = new StringTokenizer(str);
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            String dir =st.nextToken();
            if(hm.get(z)==null) { System.out.println(-1);continue;}
            
            String ss = hm.get(z);
            if(ss.length()==1 && Integer.parseInt(ss)==y) System.out.println(0);
			else {
				int ans=3002; 
				 
		         StringTokenizer stk = new StringTokenizer(ss," ");
		         while(stk.hasMoreTokens()) { int t = Integer.parseInt(stk.nextToken());
				if((dir.equals("R") && y>t) || (dir.equals("L") && y<t)) {
				 
					ans = Math.min(ans, N-Math.abs(t-y)) ;
				 }
				else {
					ans = Math.min(ans, Math.abs(t-y)) ;
				}
		         }
				System.out.println(ans);
			}
        

	}
	}
}
