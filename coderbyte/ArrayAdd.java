/*globussoft q1.pdf 1)
 * 
 *  for n= 4 					for n =5
   1 2 3 4						1 2 3 4 5
    3 5 7						 3 5 7 9
     8 12						  8 12 16
      20						   20 28
 									48
 output the last value i.e 20		here it is 48
 and so on .
 */
package coderbyte;

import java.util.Scanner;

public class ArrayAdd {
	public static int[] calc(int[] b) {
		int b1[] = new int[b.length-1];
		for(int i = 0;i<b.length-1;i++) {
			b1[i] = b[i]+b[i+1];
		}
		return b1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); int n;
		System.out.println("enter the number");
		n = scan.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = i+1;
		}
		
		int sum = 0;
	
		while(true) {
		int a2[]=calc(a);
			if(a2.length==1) {
				sum = a2[0];
				break;
			}
			else {
				a = a2;
				continue;
			}
				
		}
		System.out.println(sum);
		
		

	}

}
