package com.AlphaReady.PatternAdvance_12;

public class SolidRombus {
    public static void main(String[] args) {
        int length = 5;

        for(int row=length;row>=0;row--){
            for(int s=0;s<row;s++){
                System.out.print(" ");
            }
            for(int col=0;col<=length;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
