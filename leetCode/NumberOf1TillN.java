//https://leetcode.com/problems/number-of-digit-one/solution/

package leetCode;

public class NumberOf1TillN  {
	
	public static void main(String[] args) {
	int n =100; int count=0;//n=1254654888
	
	for (long k = 1; k <= n; k *= 10) {
	    long r = n / k, m = n % k;
	    // sum up the count of ones on every place k
	    count += (r + 8) / 10 * k + (r % 10 == 1 ? m + 1 : 0);
	  }
	System.out.println( "the number of 1's till "+n+" are "+count);
	}

}
