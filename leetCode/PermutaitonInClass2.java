//https://leetcode.com/problems/permutation-in-string/description/
/*
Given two strings s1 and s2, write a function to return true if s2 
contains the permutation of s1. In other words, one of the first string's permutations 
is the substring of the second string.
Example 1:
Input:s1 = "ab" s2 = "eidbaooo"
Output:True
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:
Input:s1= "ab" s2 = "eidboaoo"
Output: False
 */
package leetCode;

import java.util.Arrays;

public class PermutaitonInClass2 {
	public static void main(String[] args) {
		String s1 = "cab"; 
		String s2 ="avcjjjhhhhbac";
		String s3="";;
		 int l = s1.length(); int m = s2.length();
		/*if(l==m) {
			char arr4[] = s1.toCharArray();Arrays.sort(arr4);
			char arr5[] = s2.toCharArray();Arrays.sort(arr5);
		
			String s11= new String(arr4), s22 = new String(arr5);
			if(s11.equals(s22)){ System.out.println("true");System.exit(0);}
			else {System.out.println("false");System.exit(0);}
		}*/
		//if(l>m) { System.out.println("false");System.exit(0);}
		char[] arr = s1.toCharArray(); char[] arr1; ; int i,j=0; 
//start with char in s2, check if in s1, if present get the next l characters, sort and compare.
		for(j=0;j<m;j++) {
			for(i = 0;i<l;i++) {
				if(s2.charAt(j)==s1.charAt(i)) {
					if(j+l<=m) {
						s3 = s2.substring(j, j+l);
						arr1 = s3.toCharArray();
						Arrays.sort(arr1);
						Arrays.sort(arr); int z=0;
						for(int k=0;k<l;k++) {
							if(arr[k]==arr1[k]) {++z;
							if(z==l) { System.out.println("true");System.exit(0);}
							else continue;
								
							}
						}
					}
				}
		}
		}
		System.out.println("false");
	}
}

