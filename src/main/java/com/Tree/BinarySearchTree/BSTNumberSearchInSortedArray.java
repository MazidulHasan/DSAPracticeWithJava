package com.Tree.BinarySearchTree;

public class BSTNumberSearchInSortedArray {
     public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + ((end-start)/2);
            if (arr[mid] == target) {
                return mid;
            }
            else if (target < arr[mid]) {
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
     }
     public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
        int targetNumber = 5;

        System.out.println("Index number is : "+binarySearch(sortedArray, targetNumber));
     }
}
