package coderbyte;

import java.util.Scanner;

public class RemoveMultSpaces {

	public static void main(String[] args) {
		// inbuilt method
		//System.out.println(new String(" hello     there   ").trim().replaceAll("\\s{2,}", " "));
		// substring whose  characters are continuous.
		// eg; Input : “owabcdjkl” output: “abcd”
		String s = "owabcdejkl"; char[] s1=new char[s.length()];
		char a[] = s.toCharArray();
		for(int i = 0;i<s.length()-1;i++) {
			char c = s.charAt(i); s1[0]=c;
			while(c==s.charAt(i+1)-1) {
				s1[i+1] = s.charAt(i+1);
				c = s.charAt(i+1);
			}
		}
		String newS = new String(s1);
		System.out.println( newS );
}
}