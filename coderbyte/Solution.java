/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/
package coderbyte;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
    	int m = nums.length;
    	int[] indices = new int[2];
    	for(int i = 0; i<m;i++) {
    		for(int j=0;j<m;j++) {
    			if(nums[i]+nums[j]==target) {
    				indices[1] = i;
    				indices[0] = j;
    			}
    		}
    	}
        return indices;
    }
    
    
    
    
    
    public static void main (String[] args) {  
       Scanner s = new Scanner(System.in);
        int[] nums = {2, 7, 11, 15};
        int[] arr=twoSum(nums,17); 
        System.out.println(Arrays.toString(arr));
      }   
      
}