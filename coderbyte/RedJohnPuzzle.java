/*globussoft q1.pdf 2)

 * Red john has committed another crime. He leaves  a puzzle for Patrick  to solve.If Patrick is
 * successful in solving then Teressa will call Red John and he will surrender himself else he
 * will murder another person.
 * Puzzle: In victim's house there is a wall of 4*N size and it also has infinite supply of 4*1,
 * and 1*4 bricks. Hidden safe will opened by particular config of bricks. Inside the safe a
 * number is there for Teressa to call. Gebreal wants to know the total no. of ways  in which 
 * bricks can be arranged on the wall so that a new config arises every time(say M).
 * Red john has recently obtained his Master's degree in Mathematics from top university, hence 
 * he wants Patrick to calculate the no. of Prime no's(p) up to M(i.e <=M).
 * 
 */
package coderbyte;

import java.util.Scanner;

public class RedJohnPuzzle {
	static int PrimeOfPerm(int n) {
		int c=0; int sn=n; int sum=0;
		if(sn<4)
			sum = sn;
		while(sn>4) {
			//System.out.println("inside while");
			sn = sn-4;
			c=c+1;
		}
		if(n>3) {
		int newN= n-3;
		sum = sum+newN;
		}
		while(c>1) {
			int n1 = n-3*c;
			//System.out.println(n1);
			sum = sum+n1;
			c--;
		}
		if(n>3)
		sum = sum+1; int newSum=0;
		 for (int i = sum; i >= 2; i--) {
	           int count = 0;
	            for (int j = 2; j <=i-1; j++) { //increment "j" not "i"
	                if (i % j == 0) {
	                  //System.out.println("inside if with i and j as "+i+" "+j);
	                    break;
	                }
	                else {count++;
	                if(count == i-j) {//System.out.println("inside count");
	                	newSum++;}
	                }
	            }
	            
	        }
		//System.out.println("primes are "+(newSum+1));
	return sum;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of test cases");
		int t = scan.nextInt();
		int[] a = new int[t];
		for(int i =0;i<t;i++) {
			System.out.println("enter the value of n for"+(i+1)+"test case");
			a[i] = scan.nextInt();
		}
		for(int i = 0;i<t;i++) {
			int res = PrimeOfPerm(a[i]);
			System.out.println(res);
		}
		
	}

}
