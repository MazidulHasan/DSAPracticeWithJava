package com.LeetCodePractise;
public class tempPractise1 {
    public static void main(String[] args) {
        int[][] matrix = {
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {-1,-1,-2,-3}
        };
        System.out.println("The count is : "+countNegatives(matrix));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    System.out.println(grid[i][j]);
                    count++;
                }
            }
        }
        return count;
    }
}
