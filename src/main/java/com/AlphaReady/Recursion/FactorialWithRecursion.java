package com.AlphaReady.Recursion;

public class FactorialWithRecursion {
    public static int printFactorial(int n){
        if (n == 0) {
            return 1;
        }
        int fnm1 = printFactorial(n-1);
        int fact = n * fnm1;
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }
}
