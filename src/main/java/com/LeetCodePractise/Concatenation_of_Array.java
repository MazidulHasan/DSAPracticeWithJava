package com.LeetCodePractise;

public class Concatenation_of_Array {
    
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length*2]; 
        int count=0;
        for(int i=0;i<ans.length;i++){
            if(count == ans.length/2){
                count=0;
            }
            ans[i] = nums[count];
            count++;
        }

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        return ans;
    }
}
