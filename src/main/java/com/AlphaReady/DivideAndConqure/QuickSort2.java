package com.AlphaReady.DivideAndConqure;

public class QuickSort2 {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }        
    }


    public static int partition(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++) {
            if (arr[j]<pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        //set the pvot to its correct position from the high position
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int []arr, int low, int high){
        if (low < high) {
            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,80,30,90,40};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
