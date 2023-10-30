package com.LeetCodePractise;

import com.HashMap.ImplementaionOfHashMap.HashMap;

public class MajorityElementHashMap {

    public static int majorityElement(int[] nums) {
        int ans = -1;
        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i],1);
            }
            if (freq.get(nums[i]) > nums.length/2) {
                System.out.println("Val:"+freq.get(nums[i]));
                ans = nums[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2};
        System.out.println(majorityElement(arr));
    }
}
