package leetCode;

import java.math.BigInteger;
import java.util.Scanner;

public class Test9192017 {
	   public static void main(String args[]){
		        Scanner scan = new Scanner(System.in);
		        BigInteger n = scan.nextBigInteger();
		        int x = scan.nextInt();
		        BigInteger ten = BigInteger.valueOf(10);
		        
		        int c =0; int total=0;
		        while(n.compareTo(BigInteger.valueOf(0)) > 0){
		        	 int c1 = n.mod(ten).intValue();
		        	 c+=c1;
		            //c+=n%10;
		            if(c>9) c-=9;
		            n=n.divide(ten);
		        }
		    total = c*x;
		    while(total>9)
		        total-=9;
		    System.out.println(total);
	}
}
