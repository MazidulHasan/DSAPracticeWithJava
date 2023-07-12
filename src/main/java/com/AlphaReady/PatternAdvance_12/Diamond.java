package com.AlphaReady.PatternAdvance_12;

public class Diamond {
    public static void main(String[] args) {
        int length = 4 ;

        for(int row=1;row<=length;row++){
            for(int s=1;s<=length-row;s++){
                System.out.print(" ");
            }
            for (int i = 0; i < 2*row-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row=length;row>=0;row--){
            for(int s=1;s<=length-row;s++){
                System.out.print(" ");
            }
            for (int i = 0; i < 2*row-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
