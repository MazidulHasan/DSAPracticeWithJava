package com.Recursion;

public class Basic {
    public static void main(String[] args) {
        //print up to a number with recursion
        recursionFucntion(10);
    }

    public static void recursionFucntion(int number){
        if (number == 0) {
            return;
        }
        System.out.println(number);
        recursionFucntion(number-1);
    }
}
