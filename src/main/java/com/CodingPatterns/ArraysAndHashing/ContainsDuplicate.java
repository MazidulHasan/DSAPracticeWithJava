package com.CodingPatterns.ArraysAndHashing;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        boolean ans= false; 
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]==nums[i]) {
					ans = true;
					break;
				}
			}
		}
        
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,5,3};
        System.out.println(containsDuplicate(arr));
    }
}
