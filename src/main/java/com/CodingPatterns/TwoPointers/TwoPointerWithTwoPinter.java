package com.CodingPatterns.TwoPointers;

public class TwoPointerWithTwoPinter {
    public static int [] twoPointerWithTwoPointer(int []arr, int target){
        int [] newarr = new int [2];

        int front = arr[0];
        int back = arr[arr.length-1];
        
        for (int i = 0, j = arr.length-1; front < back;) {
            System.out.println("Front:"+front+" and back:"+back);
            if (front + back == target) {
                newarr[0] = arr[i];
                newarr[1] = arr[j];
                return newarr;
            }
            else if (front + back > target) {
                j--;
                back = arr[j];
            }else{
                i++;
                front = arr[i];
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] sol =  twoPointerWithTwoPointer(arr, 6);
        
        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i]+ " ");
        }
    }
}
