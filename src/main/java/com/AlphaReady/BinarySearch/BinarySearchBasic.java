package com.AlphaReady.BinarySearch;

public class BinarySearchBasic {
    public static void main(String[] args) {
        int array[]= {2,5,8,12,16,23,38,56,72,91};
        int key = 38;
        System.out.println(binarySearch(array,key));
    }

    public static int binarySearch(int numbers[], int key){
        int start =0; 
        int end = numbers.length-1; 

        while(start <= end){
            int mid = (start + end) / 2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
