package leetCode;
import java.util.*;



public class W_C_64_Largest {
	 public static int dominantIndex(int[] nums) {
		 int l = nums.length;
		 int max  = nums[0];
		 for(int i=0;i<l;i++) {
			if(nums[i]>max)max = nums[i]; 
		 }
		int index=-1;
		 for(int i=0;i<l;i++) {
			 if(nums[i]==max ) index = i;
			 else if(nums[i]*2<=max) continue;
			 else {
				 return -1 ;
			 }
		 }
		 return index;
			 
	        
	    }

	public static void main(String[] args) {
		int a [] = {3, 6, 1, 0};
		System.out.println(dominantIndex(a));

	}

}
