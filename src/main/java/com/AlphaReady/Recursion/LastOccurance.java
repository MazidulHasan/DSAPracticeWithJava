package com.AlphaReady.Recursion;

public class LastOccurance {

    public static int lastOccurance(int arr[], int key, int i){
        // base condition
        if (i == arr.length) {
            return -1;            
        }
        //first look forward
        int isFound = lastOccurance(arr, key, i+1);
        if (isFound != -1 ) {
            return isFound;
        }
        //check with self
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,5};
        System.out.println(lastOccurance(arr, 2, 0));  
    }
}
