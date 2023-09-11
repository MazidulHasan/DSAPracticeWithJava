package com.AlphaReady.Recursion;

public class FriendsPairingProblem {

    public static int friendsParing(int n){
        //base case
        if (n == 1 || n == 2) {
            return n;
        }

        //single chioce
        int fnm1 = friendsParing(n-1);

        //pari
        int fnm2 = friendsParing(n-2);
        int pairWays = (n-1) * fnm2;

        //totalWays
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsParing(3));
    }
}
