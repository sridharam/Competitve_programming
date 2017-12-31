package hackeEarth;
import java.util.*;
import java.io.*;
// tle with some test case passed.
public class DC_17_HP_SplittingArray {

/*	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0) {
			int N = scan.nextInt();
			long[] a = new long[N];
			ArrayList<Long> al = new ArrayList<>();
			for(int i=0;i<N;i++) {
				a[i] = scan.nextLong();al.add(a[i]);
			}
			long[] b = new long[N];long last=0;b[N-1]=0L;
			for(int i=0;i<N-1;i++) {
				for(int j=i+1;j<N;j++) {
					if(a[i]>a[j]) {b[i]+=1;last++;}
				}
			}
			for(int i=0;i<N-1;i++) { long v =0L;
			long e = al.get(0);al.remove(0);al.add(e);
			//System.out.println(al);
				for(int j=0;j<N-1;j++) {
					if(al.get(j)>al.get(N-1)) {
						b[j]=b[j+1]+1; v+=b[j];
						}
					else {
						b[j] = b[j+1]; v+=b[j];
					}
				}
				System.out.print(v+" "); 
			} System.out.println(last);
			
		}

	}

}*/
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String str = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(str);
        int q = Integer.parseInt(st.nextToken());
       
       
        //int arr[] = new int[n];
        
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
				a[i]=Integer.parseInt(st.nextToken());al.add(a[i]);}
			long[] b = new long[N];long last=0;b[N-1]=0L;
			for(int i=0;i<N-1;i++) {
				for(int j=i+1;j<N;j++) {
					if(a[i]>a[j]) {b[i]+=1;last++;}
				}
			}
			long[] c = new long[N];ArrayList<Long> bl =(ArrayList<Long>) al.clone();c[0]=b[0]; 
				for(int i=1;i<N;i++) {Collections.rotate(bl, -1);c[i]=0;int count=0;
					for(int j=1;j<N;j++) {
						if(bl.get(0)>bl.get(j)) count++;
					}
					c[i]=count;
				
				}
			for(int i=0;i<N;i++) {
				System.out.print(c[i]+" ");
			}
			
			System.out.println();
			for(int i=0;i<N-1;i++) { long v =0L;
			//long e = al.get(0);al.remove(0);al.add(e);
			Collections.rotate(al, -1);
			//System.out.println(al);
				for(int j=0;j<N-1;j++) {
					if(al.get(j)>al.get(N-1)) {
						b[j]=b[j+1]+1; v+=b[j];
						}
					else {
						b[j] = b[j+1]; v+=b[j];
					}
				}
				System.out.print(v+" "); 
			} System.out.println(last);
			
        }
         wr.close();
         br.close();
    }
    
}