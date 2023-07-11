package com.AlphaReady.PatternAdvance_12;

public class InvertedAndRoatedHalfPyramid {
    public static void main(String[] args) {
        int pyramidHight = 4;
        
        for(int i=1;i<=pyramidHight;i++){
            for(int k=0;k<pyramidHight-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
