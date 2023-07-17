package com.AlphaReady.Array;

import java.util.HashSet;

public class Assignment1DuplicateCheck {
    public static boolean checkDuplicate(int nums[]){
        boolean ans = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j!=i && nums[i] == nums[j]) {
                    ans = true;
                    break;
                }
            }   
        }
        return ans;
    }

    public static boolean checkDuplicateMoreOptimized(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3};
        System.out.println(checkDuplicate(nums));
        System.out.println(checkDuplicateMoreOptimized(nums));
    }
}
