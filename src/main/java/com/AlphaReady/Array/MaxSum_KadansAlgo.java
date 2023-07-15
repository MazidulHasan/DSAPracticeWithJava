package com.AlphaReady.Array;

public class MaxSum_KadansAlgo {
    public static void main(String[] args) {
         int numbers [] = {-2,-3,4,-1,-2,1,5,-3};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Max Sum: "+maxSum);
    }
}
