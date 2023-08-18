package com.AlphaReady.BitManupulation;

public class SetithBit {
    public static int setithBitAns(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setithBitAns(10, 2));
    }
}
