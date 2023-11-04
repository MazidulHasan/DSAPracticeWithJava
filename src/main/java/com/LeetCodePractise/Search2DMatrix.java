package com.LeetCodePractise;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int row = 0; row < matrix.length; row++) {
            int l = 0;
            int r = matrix[row].length -1;
            while (l <= r) {
                int mid = l + (r-l)/2;
                if (matrix[row][mid] == target) {
                    return true;
                }
                if (matrix[row][mid] < target) {
                    l = mid + 1; 
                }
                else{
                    r = mid - 1; 
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 60));
    }
}
