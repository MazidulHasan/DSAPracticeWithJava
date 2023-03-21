package com.Recursion;

public class Fibonacchi {
    public static void main(String[] args) {
        int a=0, b = 1;
        System.out.println(a);
        System.out.println(b);
        printFibonacchiUpTo(a,b,10-1);
    }

    public static void printFibonacchiUpTo(int last, int secondLast,int fionacchiUpto) {
        
        if (fionacchiUpto == 0) {
            return;
        }

        int sum = last + secondLast;
        System.out.println(sum);

        printFibonacchiUpTo(secondLast, sum, fionacchiUpto-1);
    }
}