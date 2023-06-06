package com.LeetCodePractise;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<=nums.length;i++){
            boolean gotit=false;
            for(int j=0;j<nums.length;j++){
                if(i == nums[j]){
                    gotit=true;
                    break;
                }
            }
            if(gotit == false){
                ans = i;
                break; 
            }
        }
        return ans;
    }
}
