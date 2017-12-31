package leetCode;
import java.util.*;
public class FindPivotIndex {
	public static int pivotIndex(int[] nums) {
		int l = nums.length; 
		if(l<3) return -1;
		int left=0,right=0,pivot=-1;

		for (int i=1;i<l;i++ ) {
			right+= nums[i];
		}
		for (int i = 1; i < l; i++) {
			left+=nums[i-1];
			right-=nums[i];
			if(left==right) {
				pivot = i;break;
			}
		}
		return pivot;
	}

	public static void main(String[] args) {
		int a[] = {1, 2,3};
		int r = pivotIndex(a);
		System.out.println(r);
	}

}
