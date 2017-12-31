//https://leetcode.com/problems/first-missing-positive/description/
package leetCode;

import java.util.Arrays;

public class FirstMissing {

	public static void main(String[] args) {
		int arr[] = {-2,-3}; int num=0;
		System.out.println(arr.length);
		Arrays.sort(arr);
		
		if(arr.length==1) {System.out.println(1);System.exit(0);}
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]<0) continue;
			if(arr[i]+1 ==arr[i+1]) continue;
			else
				num = arr[i]+1;
		}
		if(num==0) { num=arr[arr.length-1]+1;System.out.println(num);}
		else
		System.out.println(num);

	}

}
