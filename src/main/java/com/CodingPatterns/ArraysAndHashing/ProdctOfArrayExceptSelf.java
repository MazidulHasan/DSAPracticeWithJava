package com.CodingPatterns.ArraysAndHashing;

public class ProdctOfArrayExceptSelf {

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int [] productOfArray(int [] array){
        int [] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sum = 1;
            for (int j = 0; j < array.length; j++) {
                if (i!=j) {
                    // System.out.println("Old Sum is:"+sum);
                    sum = sum*array[j];
                    // System.out.println("New Sum is:"+ sum);
                }
            }
            // System.out.println("..............................");
            newArr[i] = sum;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {-1,1,0,-3,3};
        printArray(productOfArray(arr));
    }
}
