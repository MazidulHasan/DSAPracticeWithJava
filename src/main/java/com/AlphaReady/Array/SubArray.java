package com.AlphaReady.Array;

public class SubArray {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                for (int j2 = i+1; j2 <= j; j2++) {
                    System.out.print("["+numbers[i]+","+numbers[j2]+"]");
                }
            }
            System.out.println();
        }
    }
}
