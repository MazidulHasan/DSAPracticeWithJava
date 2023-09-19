package com.CodingPatterns.ArraysAndHashing;

import java.util.Arrays;

public class Top_K_Frequent_Elements_Not_Optimized {
    public static void printString(int [] arr){
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length < 2) {
            return nums;
        }
        int [] temp = new int [k];
        Arrays.sort(nums);

        int count = 0;
        boolean isStored = false;

        for (int i = 0; i <= nums.length-1 && count<k; i++) {
            if (nums[i] != nums[i+1]) {
                isStored = true;
                // System.out.println("i"+i);
                temp[count] = nums[i];
                if (count+1 < k) {
                    count ++;
                }
            }
        }

        if (!isStored) {
            temp[k-1] = nums[nums.length-1];
        }
        
        return temp;
    }


    public static void test(int[] nums, int k){
        Arrays.sort(nums);

        int[] occurances = new int [nums[nums.length-1]+1];

        for (int i = 0; i < nums.length; i++) {
            occurances[nums[i]]++;
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int maxValue = -1;
            for (int j = 0; j < occurances.length; j++) {
                if(occurances[j]>maxValue){
                    if(i>0){
if(occurances[j]<result[i-1])
                        maxValue = occurances[j];
                    }else{
                        maxValue = occurances[j];
                    }
                    
                        
                }
            }
            result[i]=maxValue;
        }

        printString(result);
        


    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2};
        int k = 3;

        // printString(topKFrequent(nums, k));
        test(nums, k);
    }
}
