package com.Recursion;

public class SumOfNaturalNumbers {
    
    public static void main(String[] args) {
        printSum(1,6,0);
    }

    public static void printSum(int beginNumber, int endNumber, int totalSum){
        if (beginNumber == endNumber) {
            return;
        }
        totalSum = totalSum+beginNumber;
        printSum(beginNumber+1, endNumber, totalSum);
        System.out.println("Iteration value: "+beginNumber+"  and sum:"+ totalSum);
    }
}
