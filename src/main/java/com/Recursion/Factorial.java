package com.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactoriial(5));
    }

    private static int calculateFactoriial(int factorialOf) {
        if (factorialOf ==1 || factorialOf ==0) {
            return 1;
        }
        int fact_nm1 = calculateFactoriial(factorialOf-1);
        int multOfFact = factorialOf*fact_nm1;
        return multOfFact;
    }
    
}
