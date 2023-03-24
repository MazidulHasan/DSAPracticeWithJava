package com.Recursion.Intermediate;

public class ArraySortedAndIncreasing {
    public static void main(String[] args) {
        int [] array = {1,2,3,6,8};
        System.out.println(arraySortedIncreasingCheck(array, 0));
    }   
    
    public static boolean arraySortedIncreasingCheck(int [] array, int index){
        
        if (index == array.length-1) {
            return true;
        }

        if (array[index] < array[index+1]) {
            return arraySortedIncreasingCheck(array, index+1);   
        }
        else{
            return false;
        }
    }
    
}
