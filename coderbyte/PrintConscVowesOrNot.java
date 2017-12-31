/* input : a line - words separated by spaces.
 * 	check the first word with the next word if they are not of same type(either vowels or both are
 * 	not vowels) then print the second word. then check the present with the next word and so on.

*/
package coderbyte;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrintConscVowesOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		s =s.toLowerCase();
		StringTokenizer stk = new StringTokenizer(s," "); 
		int count = stk.countTokens(); System.out.println(count);String token1 ="0"; String temp=""; String token2 = ""; int i =0;
		while(stk.hasMoreTokens()) {
			
			 token2 = stk.nextToken();
			if(token1.charAt(0)=='a' ||token1.charAt(0)=='e' ||token1.charAt(0)=='i' ||token1.charAt(0)=='o' ||
					token1.charAt(0)=='u' ) {
				if(token2.charAt(0)=='a' ||token2.charAt(0)=='e' ||token2.charAt(0)=='i' ||token2.charAt(0)=='o' ||
						token2.charAt(0)=='u' ) {
				}
				else
					System.out.println(token2);
			}
			else
				if(token2.charAt(0)=='a' ||token2.charAt(0)=='e' ||token2.charAt(0)=='i' ||token2.charAt(0)=='o' ||
				token2.charAt(0)=='u' ) {
					if(i!=0)
					System.out.println(token2);
		}
				
			
			token1 = token2;
			
			
			i++;
		}

	}

}
