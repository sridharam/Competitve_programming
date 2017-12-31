package hackerRank;
import java.util.*;
import java.math.*;
public class Twotwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		HashMap<BigInteger,Boolean> hm = new HashMap<>();
		for(int j=0;j<T;j++) {
		String s = scan.next();
		StringBuilder ss = new StringBuilder(s);
		if (s.charAt(0)=='0') ss.deleteCharAt(0);
		s = ss.toString();
		int l =s.length(); int count=0;
		for(int i=0;i<l;i++) {
			for(int k=i+1;k<=l;k++) {
				BigInteger number = new BigInteger(s.substring(i,k));
				if(hm.containsKey(number)) {count++;System.out.println("insi hm"); continue;}
				if(isPowerOfTwo(number)) {count++; hm.put(number, true);}
				}
			} 
		System.out.println(count);
		}
	}
	static boolean isPowerOfTwo (BigInteger x)
    {
      
        return(! x.equals(BigInteger.ZERO) && ((x .and(x.subtract(BigInteger.ONE)).equals(BigInteger.ZERO))));
         
    }

}
