package hackeEarth;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class PractoDev_Reunionof_1_s {
	    
	  public static  int array(char[] A) {
	    	int max=0; int temp=0;int l=A.length;
	    	for(int i=0;i<l;i++) {
	    		if(A[i]=='1') {temp++;continue;}
	    		max = Math.max(max, temp);
	    		temp=0;
	    	}
	    	max = Math.max(max, temp);
	    	 return max;
	    }
	    public static void main(String[] args) {
	    	//Scanner scan = new Scanner(System.in);
	    	FastReader scan=new FastReader();
	    	int n = scan.nextInt();
	    	int k = scan.nextInt();
	    	String s =scan.next(); 
	    	char[] arr = s.toCharArray();
	    	
	    	for(int i=0;i<k;i++) {
	    		int con = scan.nextInt();
	    		if(con==1) {
	    		System.out.println( array(arr));	
	    		}
	    		else if(con==2) {
	    			int pos = scan.nextInt();
	    			arr[pos-1] = '1';
	    		}
	    	}
	    	
	    }
	    static class FastReader
	    {
	        BufferedReader br;
	        StringTokenizer st;
	 
	        public FastReader()
	        {
	            br = new BufferedReader(new
	                     InputStreamReader(System.in));
	        }
	 
	        String next()
	        {
	            while (st == null || !st.hasMoreElements())
	            {
	                try
	                {
	                    st = new StringTokenizer(br.readLine());
	                }
	                catch (IOException  e)
	                {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }
	 
	        int nextInt()
	        {
	            return Integer.parseInt(next());
	        }
	 
	        String nextLine()
	        {
	            String str = "";
	            try
	            {
	                str = br.readLine();
	            }
	            catch (IOException e)
	            {
	                e.printStackTrace();
	            }
	            return str;
	        }
	    }
	    
	
}
