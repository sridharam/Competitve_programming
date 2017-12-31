/* Alia's home work ---To find 'Handsome number'
 * Handsome number: defined as a number such that sum of all the proper divisors of handsome
 * 	number with modulus to m, has to be a devil number.This Devil number is a number whose total
 *  number of proper divisors is  fibonacci number(0,1,1,2,3....).
 *  Note: Alia's lucky number is 1 so she assumes 1 as a proper divisor always.
 Input: First line of input is t(no. of test cases) then next each t lines will contain two
 integers n(no that is to be checked),m.
 OUtput: prints true or false.
 * 
 */
package coderbyte;

import java.util.Scanner;

public class HandsomeNumber {
	public static boolean devilNumber(int n, int m) {
		
		int num = n, sum = 0;
		for(int i =2;i<num;i++) {
			if(num%i == 0)
				sum = sum+i;
		}
		sum = sum+1+num;
		System.out.println("the sum is "+sum);

		sum = sum%m;
	
		int sumNew =0;
		for (int i = 2; i<num;i++) {
			if(num%i==0)
				sumNew = sumNew+i;
		}
		 
	
		int w = sumNew;
		System.out.println(w);
	
		
		
		       double X1 = 5 * Math.pow(w, 2) + 4;
		       double X2 = 5 * Math.pow(w, 2) - 4;

		       long X1_sqrt = (long)Math.sqrt(X1);
		       long X2_sqrt = (long)Math.sqrt(X2);   

		       return (X1_sqrt*X1_sqrt == X1) || (X2_sqrt*X2_sqrt == X2) ;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of test cases");
		int t = scan.nextInt();
		int[] a = new int[t]; int [] m = new int[t];
		for(int i =0;i<t;i++) {
			System.out.println("enter the value of n for"+(i+1)+"test case"+"and m for modulus");
			a[i] = scan.nextInt();
			m[i] = scan.nextInt();
		}
		for(int i = 0;i<t;i++) {
			boolean res = devilNumber(a[i],m[i]);
			System.out.println(res);
		}

	}

}
