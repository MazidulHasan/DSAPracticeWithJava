package com.AlphaReady.Recursion;

public class RecursionBasic {

    public static void printDec(int n){
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}
