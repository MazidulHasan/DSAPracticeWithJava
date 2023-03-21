package com.Recursion;

public class UpToStackHight {
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
        int xPowernm1 = calculatePower(valueOfX, powerOfX-1);
        int calculate = valueOfX * xPowernm1;
        return calculate;
    }
}
