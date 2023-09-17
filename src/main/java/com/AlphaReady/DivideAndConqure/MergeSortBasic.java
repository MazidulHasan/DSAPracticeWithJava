package com.AlphaReady.DivideAndConqure;

public class MergeSortBasic {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si, int ei){
        if (si >= ei) {
            return;
        }

        int mid = si+ (ei-si)/2; //1.divide

        mergeSort(arr, si, mid);//2.left part
        mergeSort(arr, mid+1, ei);//2.right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[],int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1;//iterator for right part
        int k = 0;

        while (i <= mid && j<= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part
        while ( i <= mid) {
            temp[k++] = arr[i++];
        }
        //right part
        while ( j <= ei) {
            temp[k++] = arr[j++];
        }


        //copy temp to ogininal arr
        for (k = 0, i=si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        //time complexiety nlogn

        //Approach
        // 1-> Divide
        // 2-> Recursion [mergeSort(left) & mergeSort(Right)]
        // 3-> Merge (Left and Right)

        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
