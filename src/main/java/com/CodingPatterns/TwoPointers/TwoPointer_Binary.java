package com.CodingPatterns.TwoPointers;

public class TwoPointer_Binary {
    public static int [] binarySol(int [] arr, int target){
        int [] newarr = new int [2];
        

        for (int i = 0; i < arr.length; i++) {
            int currentTarget = arr[i];
            
            int high = arr.length;
            int low = i+1;

            System.out.println("low:"+low+" and high:"+high);

            while(low < high){
                System.out.println("2low:"+low+" and 2high:"+high);
                int mid = (low + high) / 2;
                if (arr[mid] + currentTarget == target) {
                    newarr[0] = arr[mid];
                    newarr[1] = arr[i];
                    return  newarr;
                }
                else if (arr[mid] + currentTarget > target) {
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
        int [] sol =  binarySol(arr, 1);
        
        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i]+ " ");
        }
    }
}
