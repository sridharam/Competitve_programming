/*Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].*/
package coderbyte;

public class RotateArray {
	 public static void rotate(int[] nums, int k) {
		 int l = nums.length;
		 int[] newArr = new int[k];
		 for(int i = 0; (l-i)>k;i++) {
			 newArr[i] = nums[l-i];
			
		 }
		 
	        
	    }

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		rotate(arr,3);

	}

}
