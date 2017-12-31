package hackerRank;
import java.math.BigInteger;
import java.util.*;
public class ArrayManipulation {
    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt(); int[] arr = new int[n+1]; 
	        BigInteger max= BigInteger.valueOf(0) ;BigInteger m1;
	        for(int a0 = 0; a0 < m; a0++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int k = in.nextInt();
	            for(;a<=b;a++){
	                arr[a]+=k;
	                 m1 = BigInteger.valueOf(arr[a]);
	                if(m1.compareTo(max)==1) max = m1;
	            }
	        }
	        
	        System.out.println(max);
	        in.close();
	    
	}
	}


