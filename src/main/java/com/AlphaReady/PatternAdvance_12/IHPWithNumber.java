package com.AlphaReady.PatternAdvance_12;

public class IHPWithNumber {
    public static void main(String[] args) {
        int pyramid = 5;
        for (int i = pyramid; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);                
            }
            System.out.println();
        }
    }
}
