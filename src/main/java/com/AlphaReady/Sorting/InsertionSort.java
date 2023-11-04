package com.AlphaReady.Sorting;

public class InsertionSort {

    public static void insertionsorting(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i] ;
            int prev = i-1;

            //finding out the correct position to incert
            while (prev >=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6};
        insertionsorting(arr);
        printArray(arr);
    }
}
