package com.AlphaReady.PatternAdvance_12;

public class HollowRombus {
    public static void main(String[] args) {
        int length = 5;
        for(int row=1;row<=length;row++){
            for(int s=1;s<=length-row;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=length;col++){
                if(row == 1 || row == length || col == 1 || col == length){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
