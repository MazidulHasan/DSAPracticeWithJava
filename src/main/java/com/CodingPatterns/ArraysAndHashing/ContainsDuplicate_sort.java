package com.CodingPatterns.ArraysAndHashing;

import java.util.Arrays;

public class ContainsDuplicate_sort {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int [] arr = {1,2,5,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
