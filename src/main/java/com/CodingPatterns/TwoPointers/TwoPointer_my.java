package com.CodingPatterns.TwoPointers;

public class TwoPointer_my {
    public static int [] twoPointer_my(int [] arr, int target){
        int [] newArr = new int [2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                // System.out.println(arr[i]+ " " +arr[j]);
                if (arr[i] + arr[j] == target) {
                    // System.out.println(arr[i]+arr[j]);
                    newArr[0] = arr[i];
                    newArr[1] = arr[j];
                    return newArr;
                }
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5};
        int target = 8;
        int [] sol =  twoPointer_my(arr, target);

        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i]+ " ");
        }
    }
}
