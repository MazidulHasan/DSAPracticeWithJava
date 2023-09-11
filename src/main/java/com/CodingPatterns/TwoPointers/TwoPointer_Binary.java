package com.CodingPatterns.TwoPointers;

public class TwoPointer_Binary {
    public static int [] binarySol(int [] arr, int target){
        int [] newarr = new int [2];
        int high = arr.length;
        int low = 1;

        for (int i = 0; i < arr.length; i++) {
            if (low <= high) {
                int mid = (low + high) / 2;
                System.out.println("Mid "+ mid);
                if ((arr[i] + arr[mid]) == target ) {
                    newarr[0] = i;
                    newarr[1] = mid;
                    return newarr;
                }
                if (mid > target) {
                    low = mid;
                }else{
                    high = mid;
                }
            }
        }
        return newarr;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] sol =  binarySol(arr, 8);
        
        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i]+ " ");
        }
    }
}
