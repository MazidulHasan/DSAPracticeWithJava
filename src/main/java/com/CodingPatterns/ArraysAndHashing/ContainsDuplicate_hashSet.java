package com.CodingPatterns.ArraysAndHashing;

import java.util.HashSet;

public class ContainsDuplicate_hashSet {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            }else{
                numbers.add(nums[i]);
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int [] arr = {1,2,5,3};
        System.out.println(containsDuplicate(arr));
    }
}
