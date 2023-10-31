package com.LeetCodePractise;

public class findExtraOfTwoSortedArray {

    public static int findExtra(int arr1[], int arr2[]){
        int index = arr1.length-1;
        int left = 0;
        int right = arr1.length-2;

        while (left <= right) {
            int mid = (left + right) /2;
            if (arr2[mid] == arr1[mid]) {
                left = mid + 1;
            }
            else{
                index = mid;
                right = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8};
        int arr2[] = {1,2,3,4,6,7,8};

        System.out.println(findExtra(arr1,arr2));
    }
}
