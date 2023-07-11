package com.AlphaReady.PatternAdvance_12;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int rowLength = 5;
        zeroOnetriangle(rowLength);
    }

    public static void zeroOnetriangle(int number){
        boolean counter=true;
        for(int i=0;i<number;i++){
            for(int j=0;j<=i;j++){
                if(counter){
                    System.out.print(" 1");
                    counter =false;
                }
                else{
                    System.out.print(" 0");
                    counter =true;
                }
            }
            System.out.println();
        }
    }
}
