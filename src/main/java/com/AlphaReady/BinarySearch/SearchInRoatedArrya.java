package com.AlphaReady.BinarySearch;

public class SearchInRoatedArrya {

    public static int searchInRoArray(int A[], int l, int h, int key) { 
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        int rotatePosition = 0;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] > A[i+1]) {
                rotatePosition = i+1;
                break;
            }
        }
        int tempArr[] = new int[A.length];
        
        int anotherCount = 0;
        for (int i = 0; i < tempArr.length; i++) {
            if(rotatePosition < tempArr.length){
                tempArr[i] = A[rotatePosition];
                rotatePosition++;
            }
            else{
                tempArr[i] = A[anotherCount];
                anotherCount++;
            }
            // System.out.println("i:"+i+"::::"+tempArr[i]);
        }

        int low = tempArr[0];
        int high = tempArr[tempArr.length-1];
        
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (tempArr[mid] == key) {
                return mid;
            }
            if (tempArr[mid] < key) {
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        
        return -1;
        
    } 

    public static void main(String[] args) {
         int [] arr = new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3};
         System.out.println(searchInRoArray(arr, 0, 8, 5));
    }
}