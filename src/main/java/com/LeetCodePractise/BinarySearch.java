package com.LeetCodePractise;

public class BinarySearch {

    public static int search(int [] nums, int target){
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

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(search(arr, 8));
    }
}
