package com.LeetCodePractise;

public class MajorityElement {
    
    public static int majorityElement(int[] nums) {
        int majority = nums[0], votes = 1;

        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                votes++;
                majority = nums[i];
            }else if (majority == nums[i]) {
                votes++;   
            }else{
                votes--;   
            }
        }

        return majority;
    }

    public static void main(String[] args) {
        int arr[] = {6,5,5};
        System.out.println(majorityElement(arr));
    }
}
