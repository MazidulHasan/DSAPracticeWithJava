package com.AlphaReady.Array;


public class ReverseAnArray {
    public static void main(String[] args) {
        int numbers [] = {2,4,5,6,7,8,10};
        ArrayReverse.reverse(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" "+numbers[i]);
        }
    }

    public static class ArrayReverse{
        public static void reverse(int numbers[]){
            int first = 0 ;
            int last = numbers.length-1;

            while (first < last) {
                //swap
                int temp = numbers[last];
                numbers[last] = numbers[first];
                numbers[first] = temp;

                first++;
                last--;
            }
        }
    }
}
