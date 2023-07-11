package com.AlphaReady.PatternAdvance_12;

public class FloydsTriangle {
    public static void main(String[] args) {
        int floyedNumber =5;
        generateFloyedPyramid(floyedNumber);
    }

    public static void generateFloyedPyramid(int number){
        int counter=1;
        for(int row = 1; row<=number;row++){
            for(int col = 1; col<=row;col++){
                System.out.print(" "+counter);
                counter++;
            }
            System.out.println();
        }
    }
}
