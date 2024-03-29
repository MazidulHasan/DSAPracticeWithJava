package com.AlphaReady.DivideAndConqure;


// best case : n logn
// worst case: n2
// space: 1

// if space is needed the we can use this. Though it might take n2 in some case


public class QuickSort {

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }        
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        //last element
       int pIdx = partition(arr, si, ei);
       quickSort(arr, si, pIdx-1);
       quickSort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si -1; //to make place for els smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {10,80,30,90,40};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
