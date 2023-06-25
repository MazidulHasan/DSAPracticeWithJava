package com.DynamicProgramming;

import java.util.Arrays;

public class MaximumSumRectangle {
    static int maximumSumRectangledo(int R, int C, int M[][]){
        int sum[] = new int [R];
        int maxSum = Integer.MIN_VALUE;

        for (int cStart = 0; cStart < C; cStart++) {
            Arrays.fill(sum, 0);
            for (int cEnd = 0; cEnd<C; cEnd++) {
                for (int row = 0; row < R; row++) {
                    sum[row] += M[row][cEnd];
                }
                int curMaxSum = kadansAlgo(sum);
                maxSum = Math.max(maxSum, curMaxSum);
            }
        }
        return maxSum;
    }

    static int kadansAlgo(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here
                                            = 0;
 
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
