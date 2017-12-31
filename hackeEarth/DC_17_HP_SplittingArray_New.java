package hackeEarth;
import java.util.*;
import java.io.*;
public class DC_17_HP_SplittingArray_New {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String str = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(str);
        int q = Integer.parseInt(st.nextToken());
        
        while(q-->0)
        {      
        	 str = br.readLine().trim();
             st = new StringTokenizer(str);
        	int N = Integer.parseInt(st.nextToken());
        	long[] a = new long[N];
        	str = br.readLine().trim();
            st = new StringTokenizer(str);
			ArrayList<Long> al = new ArrayList<>();
			for(int i=0;i<N;i++) {
				a[i]=Integer.parseInt(st.nextToken());
				al.add(a[i]);
				}
			long[] b = new long[N];long last=0;b[N-1]=0L;
			for(int i=0;i<N-1;i++) {
				for(int j=i+1;j<N;j++) {
					if(a[i]>a[j]) {b[i]+=1;last++;}
				}
			}
			long[] c = new long[N];c[0]=b[0]; 
				for(int i=1;i<N;i++) { Collections.rotate(al, -1);c[i]=0;int count=0;
					for(int j=1;j<N;j++) {
						if(al.get(0)>al.get(j)) count++;
					}
					c[i]=count;
				
				}
			long next = last-c[0];long ans;
			for(int i=0;i<N-1;i++) { 
				ans = next+N-c[i]-1;next=ans-c[i+1];
				System.out.print(ans+" "); 
			} System.out.println(last);
			
        }
         wr.close();
         br.close();
    }
    
}