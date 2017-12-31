package hackeEarth;
import java.io.*;
import java.util.*;
//not done
public class DC_17_BerlandProContests {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String str = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(str);
        int T = Integer.parseInt(st.nextToken());
        while(T-->0) {
        	str = br.readLine().trim();
            st = new StringTokenizer(str);
            int N = Integer.parseInt(st.nextToken());int n=N-1; int n1=N;
            int M = Integer.parseInt(st.nextToken());
            while(n-->0) {
            	str = br.readLine().trim();
                st = new StringTokenizer(str);
            }
           	//str = br.readLine().trim();
           // st = new StringTokenizer(str);
            Vector<Vector<Integer>> a = new Vector<Vector<Integer>>();
            
            for(int i=0;i<N;i++) {
            	Vector<Integer> temp = new Vector<Integer>();
            	str = br.readLine().trim();
                st = new StringTokenizer(str);
            	for(int j=1;j<M+1;j++) {
            		if(Integer.parseInt(st.nextToken())==0) continue;
            		else temp.add(j);
            	}
            	a.add(temp);
            }
            System.out.println(a); int l = N*(N+1)/2; long ans[] = new long[M+1];Arrays.fill(ans, 0);
            for(int i=0;i<N;i++) {
            		Vector<Integer> temp = a.get(i); int size = temp.size();
            		ans[size] = size;
            		for(int j=i+1;j<N;j++) {
            			Vector<Integer> temp1 = a.get(j);	
            		}
            }
                
            
        }

	}

}
