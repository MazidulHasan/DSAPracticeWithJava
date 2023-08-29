package com.AlphaReady.Recursion;

public class SumOfNumbers {
    public static int sum(int n){
        if (n == 1) {
            return 1;
        }
        int newSum = n + sum(n-1);
        return newSum;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
