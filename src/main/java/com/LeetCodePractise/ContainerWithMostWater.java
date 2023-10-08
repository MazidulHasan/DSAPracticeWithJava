package com.LeetCodePractise;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxSum = 1;
        int pointer1 = height[0];
        for (int i = 0; i < height.length - 1; i++) {
            System.out.println("Max Sum :"+maxSum);
            if (pointer1 < height[i]) {
                pointer1 = height[i];
            }
            int count = 1;
            for (int j = i+1; j < height.length; j++) {
                if (height[i] >= height[j]) {
                    int currnetHeight = count*height[j];
                    System.out.println("Current Height"+count+"*"+height[j]+"="+currnetHeight);
                    if (maxSum < currnetHeight) {
                        maxSum = currnetHeight;
                    }
                }
                count++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,8};
        System.out.println(maxArea(height));
    }
}
