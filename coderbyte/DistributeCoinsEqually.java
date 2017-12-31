/* Tits, Tipu and Ritu are brothers. Father has N coins and should distribute equal amount of coins
 *  to three brothers. if possible to distribute print "yes" else print"no"
 *  input: enter t(no of cases) t lines follows
 *  	each line cointains N- no coins and the second line containg the values of coins.
 *  	
*/
package coderbyte;

import java.util.Scanner;

public class DistributeCoinsEqually {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of coins");
		int n = scan.nextInt();
		int[] arr = new int[n]; int sum = 0; int max=0;
		System.out.println("enter the coins");
		for(int i =0;i<n;i++) {
			arr[i] = scan.nextInt();
			sum = sum+arr[i];
			if(arr[i]>max) {max=arr[i];}
		}
		int avg = sum/3;
		for(int j =0;j<n;j++) {
			if(avg<max) { System.out.println("No");System.exit(0);}
			}
		
		if(sum%3 == 0) {
			
			
			 if(avg%2 == 0) {
				 int count = 0;
				 for(int i =0;i<n;i++) {
					 
					if(arr[i]%2 ==1)
						count++;
					}
				 if(count%2 == 0) {
					 System.out.println("YES");System.exit(0);
				 }
				 else { System.out.println("No");System.exit(0);}
				 
			 }
			 else if(avg%2 == 1) {
				 int count = 0;
				 for(int i =0;i<n;i++) {
						if(arr[i]%2 ==1)
							count++;
				 }
				 if(count%2==1) {
					 System.out.println("YES");System.exit(0);
				 }
				 else { System.out.println("No");System.exit(0);} 
			 }
			
		}
	System.out.println("no");
	}

}
