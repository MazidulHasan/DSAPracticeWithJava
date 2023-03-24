package com.Recursion.Intermediate;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int numberOfDisk = 3;
        towerOfHanoiexecute(numberOfDisk, "S","H","D");
    }

    public static void towerOfHanoiexecute(int numberOfDisk, String source, String helper, String dest){
        if (numberOfDisk == 1) {
            System.out.println("Transfer disk "+ numberOfDisk+" from "+ source+ " to "+dest);
            return;
        }
        towerOfHanoiexecute(numberOfDisk-1, source, dest, helper);
        System.out.println("Transfer disk "+ numberOfDisk+" from "+ source+ " to "+dest);
        towerOfHanoiexecute(numberOfDisk-1, helper, source, dest);
    }
}
