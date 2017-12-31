
package hackeEarth;
import java.util.*;
import java.math.*;
public class CountingStrings {
	public static void main(String args[] ) throws Exception {
	String s ="abbzbba"; int h;
	int l =s.length(); int preIndex=0; //int sum=0; 
	//BigInteger k = new BigInteger(499981514584);
	BigInteger sum = BigInteger.ZERO;
	for(int i=0;i<l;i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='z') {
			
			if(i-preIndex>1) { 
				h=(l-i)*(i-preIndex);
				sum = sum.add(BigInteger.valueOf(h));}
			else sum= sum.add(BigInteger.valueOf(l-i));
			preIndex = i;//previous index=current accurance 'a' or 'z' Index. for next iteration.

			}
		}
		
	System.out.println(sum);
}
}