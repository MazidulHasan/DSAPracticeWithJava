package com.Recursion;

public class longN {
    public static void main(String[] args) {
        System.out.println(calculatePower(2,5));
    }

    public static int calculatePower(int valueOfX, int powerOfX){

        if (powerOfX == 0) {
            return 1;
        }
        if (valueOfX == 0) {
            return 1;
        }
        
        if (powerOfX % 2 == 0) {
            //the power is even
            return calculatePower(valueOfX, powerOfX/2) * calculatePower(valueOfX, powerOfX/2); 
        }
        else{
            // if n is odd
            return calculatePower(valueOfX, powerOfX/2) * calculatePower(valueOfX, powerOfX/2) * valueOfX;
        }
    }
}
