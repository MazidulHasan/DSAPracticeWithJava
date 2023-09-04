package com.AlphaReady.Recursion;

public class FindFirstOccurance {
    public static int firstOccurance(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,5};
        System.out.println(firstOccurance(arr, 4, 0));
    }
}
