package com.LeetCodePractise;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            
        }
        int l = 0;
        int r = nums.length -1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                l = mid + 1; 
            }
            else{
                r = mid - 1; 
            }
        }
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    }
}
