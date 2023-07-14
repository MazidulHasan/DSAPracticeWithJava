package com.AlphaReady.Array;

public class Pairs {
      public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7,8};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("("+numbers[i]+","+numbers[j] + ")");
            }
            System.out.println();
        }
      }
}
