package com.AlphaReady.PatternAdvance_12;

public class ButterFlyPattern {
    public static void main(String[] args) {
         int totalLength = 10;

         for (int i = 1; i <= totalLength; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int s = 0; s < 2*(totalLength-i); s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
         }
         for (int i = totalLength; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int s = 0; s < 2*(totalLength-i); s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
         }
    }
}
