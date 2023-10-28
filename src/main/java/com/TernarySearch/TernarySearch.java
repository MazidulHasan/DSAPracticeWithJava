package com.TernarySearch;

public class TernarySearch {

    public static int ternarySearch(int l, int r, int key, int arr[]){
        if (r >=l) {
            //find the two middle point
            int mid1 = l + (r-l)/3;
            int mid2 = r - (r-l)/3;

            //check if the key is present at any mid point
            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }

            //If no mid is equal then need to repeate the operation by changin the l and r points
            if (key < arr[mid1]) {
                return ternarySearch(l, mid1-1, key, arr);
            }
            else if (key > arr[mid2]) {
                return ternarySearch(mid2+1, r, key, arr);
            }
            else{
                return ternarySearch(mid1+1, mid2-1, key, arr);
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        //starting index
        int l= 0 ;
        //ending index
        int r= arr.length-1;
        //Need to search
        int key = 50;

        System.out.println(ternarySearch(l, r, key, arr));
    }
}
